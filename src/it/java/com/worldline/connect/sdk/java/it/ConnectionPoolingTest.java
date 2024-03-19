package com.worldline.connect.sdk.java.it;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.jupiter.api.Test;

import com.worldline.connect.sdk.java.Communicator;
import com.worldline.connect.sdk.java.CommunicatorConfiguration;
import com.worldline.connect.sdk.java.Factory;
import com.worldline.connect.sdk.java.v1.merchant.services.ConvertAmountParams;
import com.worldline.connect.sdk.java.v1.merchant.services.ServicesClient;

class ConnectionPoolingTest extends ItTest {

    @Test
    void testConnectionPoolingMaxIsRequestCount() throws Exception {
        testConnectionPooling(10, 10);
    }

    @Test
    void testConnectionPoolingMaxIsHalfRequestCount() throws Exception {
        testConnectionPooling(10, 5);
    }

    @Test
    void testConnectionPoolingMaxIsOne() throws Exception {
        testConnectionPooling(10, 1);
    }

    private void testConnectionPooling(int requestCount, int maxConnections) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(requestCount);
        try {
            CommunicatorConfiguration configuration = getCommunicatorConfiguration()
                    .withMaxConnections(maxConnections);
            try (Communicator communicator = Factory.createCommunicator(configuration)) {
                testConnectionPooling(executorService, communicator, requestCount);
            }
        } finally {
            executorService.shutdown();
        }
    }

    private void testConnectionPooling(ExecutorService executorService, Communicator communicator, int requestCount) throws Exception {
        List<Future<ConvertAmountResult>> futures = new ArrayList<>(requestCount);
        CountDownLatch barrier = new CountDownLatch(1);
        for (int i = 0; i < requestCount; i++) {
            Future<ConvertAmountResult> future = executorService.submit(new ConvertAmountAction(barrier, i, communicator));
            futures.add(future);
        }
        barrier.countDown();

        List<ConvertAmountResult> results = new ArrayList<>(requestCount);
        for (Future<ConvertAmountResult> future : futures) {
            results.add(future.get());
        }
        // actual concurrent use of connections will need to be verified in the server logs
    }

    private final class ConvertAmountAction implements Callable<ConvertAmountResult> {

        private final CountDownLatch barrier;
        private final ServicesClient servicesClient;
        private final ConvertAmountParams request;

        @SuppressWarnings("resource")
        private ConvertAmountAction(CountDownLatch barrier, int index, Communicator communicator) {
            this.barrier = barrier;
            this.servicesClient = Factory.createClient(communicator)
                    .withClientMetaInfo("")
                    .v1()
                    .merchant(getMerchantId())
                    .services();

            request = new ConvertAmountParams();
            request.setSource("USD");
            request.setTarget("EUR");
            request.setAmount(100L * (index + 1));
        }

        @Override
        public ConvertAmountResult call() throws Exception {
            barrier.await();

            long startTime = System.currentTimeMillis();
            servicesClient.convertAmount(request).getConvertedAmount();
            long endTime = System.currentTimeMillis();

            return new ConvertAmountResult(startTime, endTime);
        }
    }

    private static final class ConvertAmountResult {

        @SuppressWarnings("unused")
        private final long startTime;
        @SuppressWarnings("unused")
        private final long endTime;

        private ConvertAmountResult(long startTime, long endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }
    }
}

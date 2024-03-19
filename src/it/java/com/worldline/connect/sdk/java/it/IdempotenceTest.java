package com.worldline.connect.sdk.java.it;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.UUID;

import org.junit.jupiter.api.Test;

import com.worldline.connect.sdk.java.CallContext;
import com.worldline.connect.sdk.java.Client;
import com.worldline.connect.sdk.java.v1.DeclinedPaymentException;
import com.worldline.connect.sdk.java.v1.domain.Address;
import com.worldline.connect.sdk.java.v1.domain.AmountOfMoney;
import com.worldline.connect.sdk.java.v1.domain.CreatePaymentRequest;
import com.worldline.connect.sdk.java.v1.domain.CreatePaymentResult;
import com.worldline.connect.sdk.java.v1.domain.Customer;
import com.worldline.connect.sdk.java.v1.domain.Order;
import com.worldline.connect.sdk.java.v1.domain.RedirectPaymentMethodSpecificInput;
import com.worldline.connect.sdk.java.v1.domain.RedirectPaymentProduct809SpecificInput;
import com.worldline.connect.sdk.java.v1.domain.RedirectionData;

class IdempotenceTest extends ItTest {

    /**
     * Smoke test for idempotence.
     */
    @Test
    void test() throws URISyntaxException, IOException {
        CreatePaymentRequest body = new CreatePaymentRequest();

        Order order = new Order();

        AmountOfMoney amountOfMoney = new AmountOfMoney();
        amountOfMoney.setCurrencyCode("EUR");
        amountOfMoney.setAmount(100L);
        order.setAmountOfMoney(amountOfMoney);

        Customer customer = new Customer();
        customer.setLocale("en");

        Address billingAddress = new Address();
        billingAddress.setCountryCode("NL");
        customer.setBillingAddress(billingAddress);

        order.setCustomer(customer);
        body.setOrder(order);

        RedirectionData redirectionData = new RedirectionData();
        redirectionData.setReturnUrl("http://example.com/");

        RedirectPaymentMethodSpecificInput paymentMethodSpecificInput = new RedirectPaymentMethodSpecificInput();
        paymentMethodSpecificInput.setRedirectionData(redirectionData);
        paymentMethodSpecificInput.setPaymentProductId(809);

        RedirectPaymentProduct809SpecificInput paymentProductSpecificInput = new RedirectPaymentProduct809SpecificInput();
        paymentProductSpecificInput.setIssuerId("INGBNL2A");
        paymentMethodSpecificInput.setPaymentProduct809SpecificInput(paymentProductSpecificInput);

        body.setRedirectPaymentMethodSpecificInput(paymentMethodSpecificInput);

        String idempotenceKey = UUID.randomUUID().toString();
        CallContext context = new CallContext().withIdempotenceKey(idempotenceKey);

        try (Client client = getClient()) {
            CreatePaymentResult result = doCreatePayment(client, body, context);
            String paymentId = result.getPayment().getId();
            String status = result.getPayment().getStatus();

            assertEquals(idempotenceKey, context.getIdempotenceKey());
            assertNull(context.getIdempotenceRequestTimestamp());

            result = doCreatePayment(client, body, context);

            assertEquals(paymentId, result.getPayment().getId());
            assertEquals(status, result.getPayment().getStatus());

            assertEquals(idempotenceKey, context.getIdempotenceKey());
            assertNotNull(context.getIdempotenceRequestTimestamp());
        }
    }

    private CreatePaymentResult doCreatePayment(Client client, CreatePaymentRequest body, CallContext context) {
        // For this test it doesn't matter if the response is successful or declined,
        // as long as idempotence is handled correctly
        try {
            return client.v1().merchant(getMerchantId()).payments().create(body, context);
        } catch (DeclinedPaymentException e) {
            return e.getCreatePaymentResult();
        }
    }
}

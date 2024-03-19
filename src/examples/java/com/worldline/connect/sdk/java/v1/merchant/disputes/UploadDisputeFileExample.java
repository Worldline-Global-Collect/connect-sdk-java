/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.merchant.disputes;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;

import com.worldline.connect.sdk.java.Client;
import com.worldline.connect.sdk.java.CommunicatorConfiguration;
import com.worldline.connect.sdk.java.Factory;
import com.worldline.connect.sdk.java.domain.UploadableFile;
import com.worldline.connect.sdk.java.v1.domain.UploadDisputeFileResponse;

public class UploadDisputeFileExample {

    @SuppressWarnings({"unused", "resource"})
    public void example() throws URISyntaxException, IOException {
        try (Client client = getClient()) {
            UploadFileRequest body = new UploadFileRequest();
            InputStream fileContent = new FileInputStream("file.pdf");
            body.setFile(new UploadableFile("file.pdf", fileContent, "application/pdf"));

            try {
                UploadDisputeFileResponse response = client.v1().merchant("merchantId").disputes().uploadFile("disputeId", body);
            } finally {
                fileContent.close();
            }
        }
    }

    private Client getClient() throws URISyntaxException {
        String apiKeyId = System.getProperty("connect.api.apiKeyId", "someKey");
        String secretApiKey = System.getProperty("connect.api.secretApiKey", "someSecret");

        URL propertiesUrl = getClass().getResource("/example-configuration.properties");
        CommunicatorConfiguration configuration = Factory.createConfiguration(propertiesUrl.toURI(), apiKeyId, secretApiKey);
        return Factory.createClient(configuration);
    }
}

/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.merchant.mandates;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import com.worldline.connect.sdk.java.Client;
import com.worldline.connect.sdk.java.CommunicatorConfiguration;
import com.worldline.connect.sdk.java.Factory;
import com.worldline.connect.sdk.java.v1.domain.BankAccountIban;
import com.worldline.connect.sdk.java.v1.domain.CreateMandateRequest;
import com.worldline.connect.sdk.java.v1.domain.CreateMandateResponse;
import com.worldline.connect.sdk.java.v1.domain.MandateAddress;
import com.worldline.connect.sdk.java.v1.domain.MandateContactDetails;
import com.worldline.connect.sdk.java.v1.domain.MandateCustomer;
import com.worldline.connect.sdk.java.v1.domain.MandatePersonalInformation;
import com.worldline.connect.sdk.java.v1.domain.MandatePersonalName;

public class CreateMandateWithReferenceExample {

    @SuppressWarnings("unused")
    public void example() throws URISyntaxException, IOException {
        try (Client client = getClient()) {
            BankAccountIban bankAccountIban = new BankAccountIban();
            bankAccountIban.setIban("DE46720200700359736690");

            MandateContactDetails contactDetails = new MandateContactDetails();
            contactDetails.setEmailAddress("wile.e.coyote@acmelabs.com");

            MandateAddress mandateAddress = new MandateAddress();
            mandateAddress.setCity("Monumentenvallei");
            mandateAddress.setCountryCode("NL");
            mandateAddress.setStreet("Woestijnweg");
            mandateAddress.setZip("1337XD");

            MandatePersonalName name = new MandatePersonalName();
            name.setFirstName("Wile");
            name.setSurname("Coyote");

            MandatePersonalInformation personalInformation = new MandatePersonalInformation();
            personalInformation.setName(name);
            personalInformation.setTitle("Miss");

            MandateCustomer customer = new MandateCustomer();
            customer.setBankAccountIban(bankAccountIban);
            customer.setCompanyName("Acme labs");
            customer.setContactDetails(contactDetails);
            customer.setMandateAddress(mandateAddress);
            customer.setPersonalInformation(personalInformation);

            CreateMandateRequest body = new CreateMandateRequest();
            body.setCustomer(customer);
            body.setCustomerReference("idonthaveareference");
            body.setLanguage("nl");
            body.setRecurrenceType("UNIQUE");
            body.setSignatureType("UNSIGNED");

            CreateMandateResponse response = client.v1().merchant("merchantId").mandates().createWithMandateReference("42268d8067df43e18a50a2ebf4bdb729", body);
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

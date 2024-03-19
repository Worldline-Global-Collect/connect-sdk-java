/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.merchant.payments;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import com.worldline.connect.sdk.java.Client;
import com.worldline.connect.sdk.java.CommunicatorConfiguration;
import com.worldline.connect.sdk.java.Factory;
import com.worldline.connect.sdk.java.v1.ApiException;
import com.worldline.connect.sdk.java.v1.DeclinedRefundException;
import com.worldline.connect.sdk.java.v1.domain.APIError;
import com.worldline.connect.sdk.java.v1.domain.AddressPersonal;
import com.worldline.connect.sdk.java.v1.domain.AmountOfMoney;
import com.worldline.connect.sdk.java.v1.domain.BankAccountIban;
import com.worldline.connect.sdk.java.v1.domain.BankRefundMethodSpecificInput;
import com.worldline.connect.sdk.java.v1.domain.ContactDetailsBase;
import com.worldline.connect.sdk.java.v1.domain.PersonalName;
import com.worldline.connect.sdk.java.v1.domain.RefundCustomer;
import com.worldline.connect.sdk.java.v1.domain.RefundReferences;
import com.worldline.connect.sdk.java.v1.domain.RefundRequest;
import com.worldline.connect.sdk.java.v1.domain.RefundResponse;
import com.worldline.connect.sdk.java.v1.domain.RefundResult;

public class RefundPaymentExample {

    @SuppressWarnings("unused")
    public void example() throws URISyntaxException, IOException {
        try (Client client = getClient()) {
            AmountOfMoney amountOfMoney = new AmountOfMoney();
            amountOfMoney.setAmount(1L);
            amountOfMoney.setCurrencyCode("EUR");

            BankAccountIban bankAccountIban = new BankAccountIban();
            bankAccountIban.setIban("NL53INGB0000000036");

            BankRefundMethodSpecificInput bankRefundMethodSpecificInput = new BankRefundMethodSpecificInput();
            bankRefundMethodSpecificInput.setBankAccountIban(bankAccountIban);

            PersonalName name = new PersonalName();
            name.setSurname("Coyote");

            AddressPersonal address = new AddressPersonal();
            address.setCountryCode("US");
            address.setName(name);

            ContactDetailsBase contactDetails = new ContactDetailsBase();
            contactDetails.setEmailAddress("wile.e.coyote@acmelabs.com");
            contactDetails.setEmailMessageType("html");

            RefundCustomer customer = new RefundCustomer();
            customer.setAddress(address);
            customer.setContactDetails(contactDetails);

            RefundReferences refundReferences = new RefundReferences();
            refundReferences.setMerchantReference("AcmeOrder0001");

            RefundRequest body = new RefundRequest();
            body.setAmountOfMoney(amountOfMoney);
            body.setBankRefundMethodSpecificInput(bankRefundMethodSpecificInput);
            body.setCustomer(customer);
            body.setRefundDate("20140306");
            body.setRefundReferences(refundReferences);

            try {
                RefundResponse response = client.v1().merchant("merchantId").payments().refund("paymentId", body);
            } catch (DeclinedRefundException e) {
                handleDeclinedRefund(e.getRefundResult());
            } catch (ApiException e) {
                handleApiErrors(e.getErrors());
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

    @SuppressWarnings("unused")
    private void handleDeclinedRefund(RefundResult refundResult) {
        // handle the result here
    }

    @SuppressWarnings("unused")
    private void handleApiErrors(List<APIError> errors) {
        // handle the errors here
    }
}

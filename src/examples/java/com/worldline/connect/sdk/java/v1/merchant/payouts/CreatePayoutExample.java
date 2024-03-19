/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.merchant.payouts;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import com.worldline.connect.sdk.java.Client;
import com.worldline.connect.sdk.java.CommunicatorConfiguration;
import com.worldline.connect.sdk.java.Factory;
import com.worldline.connect.sdk.java.v1.ApiException;
import com.worldline.connect.sdk.java.v1.DeclinedPayoutException;
import com.worldline.connect.sdk.java.v1.domain.APIError;
import com.worldline.connect.sdk.java.v1.domain.Address;
import com.worldline.connect.sdk.java.v1.domain.AmountOfMoney;
import com.worldline.connect.sdk.java.v1.domain.BankAccountIban;
import com.worldline.connect.sdk.java.v1.domain.BankTransferPayoutMethodSpecificInput;
import com.worldline.connect.sdk.java.v1.domain.CompanyInformation;
import com.worldline.connect.sdk.java.v1.domain.ContactDetailsBase;
import com.worldline.connect.sdk.java.v1.domain.CreatePayoutRequest;
import com.worldline.connect.sdk.java.v1.domain.PayoutCustomer;
import com.worldline.connect.sdk.java.v1.domain.PayoutDetails;
import com.worldline.connect.sdk.java.v1.domain.PayoutReferences;
import com.worldline.connect.sdk.java.v1.domain.PayoutResponse;
import com.worldline.connect.sdk.java.v1.domain.PayoutResult;
import com.worldline.connect.sdk.java.v1.domain.PersonalName;

public class CreatePayoutExample {

    @SuppressWarnings("unused")
    public void example() throws URISyntaxException, IOException {
        try (Client client = getClient()) {
            BankAccountIban bankAccountIban = new BankAccountIban();
            bankAccountIban.setAccountHolderName("Wile E. Coyote");
            bankAccountIban.setIban("IT60X0542811101000000123456");

            BankTransferPayoutMethodSpecificInput bankTransferPayoutMethodSpecificInput = new BankTransferPayoutMethodSpecificInput();
            bankTransferPayoutMethodSpecificInput.setBankAccountIban(bankAccountIban);
            bankTransferPayoutMethodSpecificInput.setPayoutDate("20150102");
            bankTransferPayoutMethodSpecificInput.setPayoutText("Payout Acme");
            bankTransferPayoutMethodSpecificInput.setSwiftCode("swift");

            AmountOfMoney amountOfMoney = new AmountOfMoney();
            amountOfMoney.setAmount(2345L);
            amountOfMoney.setCurrencyCode("EUR");

            Address address = new Address();
            address.setCity("Burbank");
            address.setCountryCode("US");
            address.setHouseNumber("411");
            address.setState("California");
            address.setStreet("N Hollywood Way");
            address.setZip("91505");

            CompanyInformation companyInformation = new CompanyInformation();
            companyInformation.setName("Acme Labs");

            ContactDetailsBase contactDetails = new ContactDetailsBase();
            contactDetails.setEmailAddress("wile.e.coyote@acmelabs.com");

            PersonalName name = new PersonalName();
            name.setFirstName("Wile");
            name.setSurname("Coyote");
            name.setSurnamePrefix("E.");
            name.setTitle("Mr.");

            PayoutCustomer customer = new PayoutCustomer();
            customer.setAddress(address);
            customer.setCompanyInformation(companyInformation);
            customer.setContactDetails(contactDetails);
            customer.setName(name);

            PayoutReferences references = new PayoutReferences();
            references.setMerchantReference("AcmeOrder001");

            PayoutDetails payoutDetails = new PayoutDetails();
            payoutDetails.setAmountOfMoney(amountOfMoney);
            payoutDetails.setCustomer(customer);
            payoutDetails.setReferences(references);

            CreatePayoutRequest body = new CreatePayoutRequest();
            body.setBankTransferPayoutMethodSpecificInput(bankTransferPayoutMethodSpecificInput);
            body.setPayoutDetails(payoutDetails);

            try {
                PayoutResponse response = client.v1().merchant("merchantId").payouts().create(body);
            } catch (DeclinedPayoutException e) {
                handleDeclinedPayout(e.getPayoutResult());
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
    private void handleDeclinedPayout(PayoutResult payoutResult) {
        // handle the result here
    }

    @SuppressWarnings("unused")
    private void handleApiErrors(List<APIError> errors) {
        // handle the errors here
    }
}

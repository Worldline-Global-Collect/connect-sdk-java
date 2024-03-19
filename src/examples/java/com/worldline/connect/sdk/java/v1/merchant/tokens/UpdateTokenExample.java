/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.merchant.tokens;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import com.worldline.connect.sdk.java.Client;
import com.worldline.connect.sdk.java.CommunicatorConfiguration;
import com.worldline.connect.sdk.java.Factory;
import com.worldline.connect.sdk.java.v1.domain.Address;
import com.worldline.connect.sdk.java.v1.domain.CardWithoutCvv;
import com.worldline.connect.sdk.java.v1.domain.CompanyInformation;
import com.worldline.connect.sdk.java.v1.domain.CustomerToken;
import com.worldline.connect.sdk.java.v1.domain.PersonalInformationToken;
import com.worldline.connect.sdk.java.v1.domain.PersonalNameToken;
import com.worldline.connect.sdk.java.v1.domain.TokenCard;
import com.worldline.connect.sdk.java.v1.domain.TokenCardData;
import com.worldline.connect.sdk.java.v1.domain.UpdateTokenRequest;

public class UpdateTokenExample {

    public void example() throws URISyntaxException, IOException {
        try (Client client = getClient()) {
            Address billingAddress = new Address();
            billingAddress.setAdditionalInfo("b");
            billingAddress.setCity("Monument Valley");
            billingAddress.setCountryCode("US");
            billingAddress.setHouseNumber("13");
            billingAddress.setState("Utah");
            billingAddress.setStreet("Desertroad");
            billingAddress.setZip("84536");

            CompanyInformation companyInformation = new CompanyInformation();
            companyInformation.setName("Acme Labs");

            PersonalNameToken name = new PersonalNameToken();
            name.setFirstName("Wile");
            name.setSurname("Coyote");
            name.setSurnamePrefix("E.");

            PersonalInformationToken personalInformation = new PersonalInformationToken();
            personalInformation.setName(name);

            CustomerToken customer = new CustomerToken();
            customer.setBillingAddress(billingAddress);
            customer.setCompanyInformation(companyInformation);
            customer.setMerchantCustomerId("1234");
            customer.setPersonalInformation(personalInformation);

            CardWithoutCvv cardWithoutCvv = new CardWithoutCvv();
            cardWithoutCvv.setCardNumber("4567350000427977");
            cardWithoutCvv.setCardholderName("Wile E. Coyote");
            cardWithoutCvv.setExpiryDate("1299");
            cardWithoutCvv.setIssueNumber("12");

            TokenCardData data = new TokenCardData();
            data.setCardWithoutCvv(cardWithoutCvv);

            TokenCard card = new TokenCard();
            card.setCustomer(customer);
            card.setData(data);

            UpdateTokenRequest body = new UpdateTokenRequest();
            body.setCard(card);
            body.setPaymentProductId(1);

            client.v1().merchant("merchantId").tokens().update("tokenId", body);
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

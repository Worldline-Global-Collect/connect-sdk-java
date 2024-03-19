package com.worldline.connect.sdk.java.it;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;

import com.worldline.connect.sdk.java.Client;
import com.worldline.connect.sdk.java.v1.domain.Address;
import com.worldline.connect.sdk.java.v1.domain.CardWithoutCvv;
import com.worldline.connect.sdk.java.v1.domain.CreateTokenRequest;
import com.worldline.connect.sdk.java.v1.domain.CreateTokenResponse;
import com.worldline.connect.sdk.java.v1.domain.CustomerToken;
import com.worldline.connect.sdk.java.v1.domain.TokenCard;
import com.worldline.connect.sdk.java.v1.domain.TokenCardData;
import com.worldline.connect.sdk.java.v1.merchant.tokens.DeleteTokenParams;

class TokenTest extends ItTest {

    /**
     * Smoke test for token calls.
     */
    @Test
    void test() throws URISyntaxException, IOException {
        CreateTokenRequest createTokenRequest = new CreateTokenRequest();
        createTokenRequest.setPaymentProductId(1);
        TokenCard card = new TokenCard();
        createTokenRequest.setCard(card);
        CustomerToken customer = new CustomerToken();
        card.setCustomer(customer);
        Address billingAddress = new Address();
        customer.setBillingAddress(billingAddress);
        billingAddress.setCountryCode("NL");
        TokenCardData mandate = new TokenCardData();
        card.setData(mandate);
        CardWithoutCvv cardWithoutCvv = new CardWithoutCvv();
        mandate.setCardWithoutCvv(cardWithoutCvv);
        cardWithoutCvv.setCardholderName("Jan");
        cardWithoutCvv.setIssueNumber("12");
        cardWithoutCvv.setCardNumber("4567350000427977");
        cardWithoutCvv.setExpiryDate("1225");

        try (Client client = getClient()) {
            CreateTokenResponse createTokenResponse = client.v1().merchant(getMerchantId()).tokens().create(createTokenRequest);

            assertNotNull(createTokenResponse.getToken());

            DeleteTokenParams deleteTokenRequest = new DeleteTokenParams();

            client.v1().merchant(getMerchantId()).tokens().delete(createTokenResponse.getToken(), deleteTokenRequest);
        }
    }
}

package com.worldline.connect.sdk.java.json;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.worldline.connect.sdk.java.v1.domain.Address;
import com.worldline.connect.sdk.java.v1.domain.CustomerToken;
import com.worldline.connect.sdk.java.v1.domain.TokenCard;
import com.worldline.connect.sdk.java.v1.domain.TokenCardData;
import com.worldline.connect.sdk.java.v1.domain.TokenResponse;

class DefaultMarshallerTest {

    @Test
    void testUnmarshalWithExtraFields() {
        TokenResponseWithExtraField original = new TokenResponseWithExtraField();

        Address billingAddress = new Address();
        billingAddress.setCountryCode("NL");

        CustomerToken customer = new CustomerToken();
        customer.setBillingAddress(billingAddress);

        TokenCardData data = new TokenCardData();

        TokenCard card = new TokenCard();
        card.setCustomer(customer);
        card.setData(data);
        original.setCard(card);

        original.setExtraField("extra-field-value");

        String json = DefaultMarshaller.INSTANCE.marshal(original);

        TokenResponse unmarshalled = DefaultMarshaller.INSTANCE.unmarshal(json, TokenResponse.class);

        assertNotNull(unmarshalled.getCard());
        assertNotNull(unmarshalled.getCard().getCustomer());
        assertNotNull(unmarshalled.getCard().getCustomer().getBillingAddress());
        assertEquals("NL", unmarshalled.getCard().getCustomer().getBillingAddress().getCountryCode());
        assertNotNull(unmarshalled.getCard().getData());
    }

    static final class TokenResponseWithExtraField extends TokenResponse {

        private String extraField;

        String getExtraField() {
            return extraField;
        }

        void setExtraField(String extraField) {
            this.extraField = extraField;
        }
    }
}

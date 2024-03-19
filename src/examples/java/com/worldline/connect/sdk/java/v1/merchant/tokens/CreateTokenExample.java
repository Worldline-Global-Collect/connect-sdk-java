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
import com.worldline.connect.sdk.java.v1.domain.BankAccountBban;
import com.worldline.connect.sdk.java.v1.domain.CompanyInformation;
import com.worldline.connect.sdk.java.v1.domain.CreateTokenRequest;
import com.worldline.connect.sdk.java.v1.domain.CreateTokenResponse;
import com.worldline.connect.sdk.java.v1.domain.CustomerToken;
import com.worldline.connect.sdk.java.v1.domain.MandateNonSepaDirectDebit;
import com.worldline.connect.sdk.java.v1.domain.PersonalInformationToken;
import com.worldline.connect.sdk.java.v1.domain.PersonalNameToken;
import com.worldline.connect.sdk.java.v1.domain.TokenNonSepaDirectDebit;
import com.worldline.connect.sdk.java.v1.domain.TokenNonSepaDirectDebitPaymentProduct705SpecificData;

public class CreateTokenExample {

    @SuppressWarnings("unused")
    public void example() throws URISyntaxException, IOException {
        try (Client client = getClient()) {
            Address billingAddress = new Address();
            billingAddress.setAdditionalInfo("Suite II");
            billingAddress.setCity("Monument Valley");
            billingAddress.setCountryCode("US");
            billingAddress.setHouseNumber("1");
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

            BankAccountBban bankAccountBban = new BankAccountBban();
            bankAccountBban.setAccountNumber("000000123456");
            bankAccountBban.setBankCode("05428");
            bankAccountBban.setBranchCode("11101");
            bankAccountBban.setCheckDigit("X");
            bankAccountBban.setCountryCode("IT");

            TokenNonSepaDirectDebitPaymentProduct705SpecificData paymentProduct705SpecificData = new TokenNonSepaDirectDebitPaymentProduct705SpecificData();
            paymentProduct705SpecificData.setAuthorisationId("123456");
            paymentProduct705SpecificData.setBankAccountBban(bankAccountBban);

            MandateNonSepaDirectDebit mandate = new MandateNonSepaDirectDebit();
            mandate.setPaymentProduct705SpecificData(paymentProduct705SpecificData);

            TokenNonSepaDirectDebit nonSepaDirectDebit = new TokenNonSepaDirectDebit();
            nonSepaDirectDebit.setCustomer(customer);
            nonSepaDirectDebit.setMandate(mandate);

            CreateTokenRequest body = new CreateTokenRequest();
            body.setNonSepaDirectDebit(nonSepaDirectDebit);
            body.setPaymentProductId(705);

            CreateTokenResponse response = client.v1().merchant("merchantId").tokens().create(body);
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

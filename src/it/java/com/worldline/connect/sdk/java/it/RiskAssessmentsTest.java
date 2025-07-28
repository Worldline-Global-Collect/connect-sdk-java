package com.worldline.connect.sdk.java.it;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.worldline.connect.sdk.java.Client;
import com.worldline.connect.sdk.java.v1.domain.AmountOfMoney;
import com.worldline.connect.sdk.java.v1.domain.BankAccountBban;
import com.worldline.connect.sdk.java.v1.domain.CustomerRiskAssessment;
import com.worldline.connect.sdk.java.v1.domain.OrderRiskAssessment;
import com.worldline.connect.sdk.java.v1.domain.RiskAssessmentBankAccount;
import com.worldline.connect.sdk.java.v1.domain.RiskAssessmentResponse;

class RiskAssessmentsTest extends ItTest {

    /**
     * Smoke test for risk assessments service.
     */
    @Test
    @Disabled("Risk assessments are not available for pre-prod sandbox accounts")
    void test() throws URISyntaxException, IOException {
        RiskAssessmentBankAccount body = new RiskAssessmentBankAccount();

        BankAccountBban bankAccountBban = new BankAccountBban();
        bankAccountBban.setCountryCode("DE");
        bankAccountBban.setAccountNumber("0532013000");
        bankAccountBban.setBankCode("37040044");
        body.setBankAccountBban(bankAccountBban);

        OrderRiskAssessment order = new OrderRiskAssessment();

        AmountOfMoney amountOfMoney = new AmountOfMoney();
        amountOfMoney.setAmount(100L);
        amountOfMoney.setCurrencyCode("EUR");
        order.setAmountOfMoney(amountOfMoney);

        CustomerRiskAssessment customer = new CustomerRiskAssessment();
        customer.setLocale("en_GB");
        order.setCustomer(customer);

        body.setOrder(order);

        try (Client client = getClient()) {
            RiskAssessmentResponse riskAssessmentResponse = client.v1().merchant(getMerchantId()).riskassessments().bankaccounts(body);
            assertTrue(riskAssessmentResponse.getResults().size() > 0);
        }
    }
}

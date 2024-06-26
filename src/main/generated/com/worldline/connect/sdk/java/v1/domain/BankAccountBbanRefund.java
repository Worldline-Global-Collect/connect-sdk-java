/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class BankAccountBbanRefund extends BankAccountBban {

    private String bankCity;

    private String patronymicName;

    private String swiftCode;

    /**
     * City of the bank to refund to
     */
    public String getBankCity() {
        return bankCity;
    }

    /**
     * City of the bank to refund to
     */
    public void setBankCity(String value) {
        this.bankCity = value;
    }

    /**
     * Every Russian has three names: a first name, a patronymic, and a surname. The second name is a patronymic. Russian patronymic is a name derived from the father's first name by adding -ович/-евич (son of) for male, or -овна/-евна (daughter of) for females.
     */
    public String getPatronymicName() {
        return patronymicName;
    }

    /**
     * Every Russian has three names: a first name, a patronymic, and a surname. The second name is a patronymic. Russian patronymic is a name derived from the father's first name by adding -ович/-евич (son of) for male, or -овна/-евна (daughter of) for females.
     */
    public void setPatronymicName(String value) {
        this.patronymicName = value;
    }

    /**
     * The BIC is the Business Identifier Code, also known as SWIFT or Bank Identifier code. It is a code with an internationally agreed format to Identify a specific bank. The BIC contains 8 or 11 positions: the first 4 contain the bank code, followed by the country code and location code.
     */
    public String getSwiftCode() {
        return swiftCode;
    }

    /**
     * The BIC is the Business Identifier Code, also known as SWIFT or Bank Identifier code. It is a code with an internationally agreed format to Identify a specific bank. The BIC contains 8 or 11 positions: the first 4 contain the bank code, followed by the country code and location code.
     */
    public void setSwiftCode(String value) {
        this.swiftCode = value;
    }
}

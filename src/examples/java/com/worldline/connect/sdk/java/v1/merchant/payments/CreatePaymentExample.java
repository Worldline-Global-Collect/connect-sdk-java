/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.merchant.payments;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.worldline.connect.sdk.java.Client;
import com.worldline.connect.sdk.java.CommunicatorConfiguration;
import com.worldline.connect.sdk.java.Factory;
import com.worldline.connect.sdk.java.v1.ApiException;
import com.worldline.connect.sdk.java.v1.DeclinedPaymentException;
import com.worldline.connect.sdk.java.v1.domain.APIError;
import com.worldline.connect.sdk.java.v1.domain.Address;
import com.worldline.connect.sdk.java.v1.domain.AddressPersonal;
import com.worldline.connect.sdk.java.v1.domain.AmountOfMoney;
import com.worldline.connect.sdk.java.v1.domain.BrowserData;
import com.worldline.connect.sdk.java.v1.domain.Card;
import com.worldline.connect.sdk.java.v1.domain.CardPaymentMethodSpecificInput;
import com.worldline.connect.sdk.java.v1.domain.CompanyInformation;
import com.worldline.connect.sdk.java.v1.domain.ContactDetails;
import com.worldline.connect.sdk.java.v1.domain.CreatePaymentRequest;
import com.worldline.connect.sdk.java.v1.domain.CreatePaymentResponse;
import com.worldline.connect.sdk.java.v1.domain.CreatePaymentResult;
import com.worldline.connect.sdk.java.v1.domain.Customer;
import com.worldline.connect.sdk.java.v1.domain.CustomerDevice;
import com.worldline.connect.sdk.java.v1.domain.LineItem;
import com.worldline.connect.sdk.java.v1.domain.LineItemInvoiceData;
import com.worldline.connect.sdk.java.v1.domain.Order;
import com.worldline.connect.sdk.java.v1.domain.OrderInvoiceData;
import com.worldline.connect.sdk.java.v1.domain.OrderReferences;
import com.worldline.connect.sdk.java.v1.domain.PersonalInformation;
import com.worldline.connect.sdk.java.v1.domain.PersonalName;
import com.worldline.connect.sdk.java.v1.domain.RedirectionData;
import com.worldline.connect.sdk.java.v1.domain.Shipping;
import com.worldline.connect.sdk.java.v1.domain.ShoppingCart;
import com.worldline.connect.sdk.java.v1.domain.ThreeDSecure;

public class CreatePaymentExample {

    @SuppressWarnings("unused")
    public void example() throws URISyntaxException, IOException {
        try (Client client = getClient()) {
            Card card = new Card();
            card.setCardNumber("4567350000427977");
            card.setCardholderName("Wile E. Coyote");
            card.setCvv("123");
            card.setExpiryDate("1299");

            AmountOfMoney authenticationAmount = new AmountOfMoney();
            authenticationAmount.setAmount(2980L);
            authenticationAmount.setCurrencyCode("EUR");

            RedirectionData redirectionData = new RedirectionData();
            redirectionData.setReturnUrl("https://hostname.myownwebsite.url");

            ThreeDSecure threeDSecure = new ThreeDSecure();
            threeDSecure.setAuthenticationAmount(authenticationAmount);
            threeDSecure.setAuthenticationFlow("browser");
            threeDSecure.setChallengeCanvasSize("600x400");
            threeDSecure.setChallengeIndicator("challenge-requested");
            threeDSecure.setExemptionRequest("none");
            threeDSecure.setRedirectionData(redirectionData);
            threeDSecure.setSkipAuthentication(false);

            CardPaymentMethodSpecificInput cardPaymentMethodSpecificInput = new CardPaymentMethodSpecificInput();
            cardPaymentMethodSpecificInput.setCard(card);
            cardPaymentMethodSpecificInput.setIsRecurring(false);
            cardPaymentMethodSpecificInput.setMerchantInitiatedReasonIndicator("delayedCharges");
            cardPaymentMethodSpecificInput.setPaymentProductId(1);
            cardPaymentMethodSpecificInput.setThreeDSecure(threeDSecure);
            cardPaymentMethodSpecificInput.setTransactionChannel("ECOMMERCE");

            AmountOfMoney amountOfMoney = new AmountOfMoney();
            amountOfMoney.setAmount(2980L);
            amountOfMoney.setCurrencyCode("EUR");

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
            companyInformation.setVatNumber("1234AB5678CD");

            ContactDetails contactDetails = new ContactDetails();
            contactDetails.setEmailAddress("wile.e.coyote@acmelabs.com");
            contactDetails.setFaxNumber("+1234567891");
            contactDetails.setPhoneNumber("+1234567890");

            BrowserData browserData = new BrowserData();
            browserData.setColorDepth(24);
            browserData.setJavaEnabled(false);
            browserData.setScreenHeight("1200");
            browserData.setScreenWidth("1920");

            CustomerDevice device = new CustomerDevice();
            device.setAcceptHeader("texthtml,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
            device.setBrowserData(browserData);
            device.setIpAddress("123.123.123.123");
            device.setLocale("en-US");
            device.setTimezoneOffsetUtcMinutes("420");
            device.setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_4) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/12.1 Safari/605.1.15");

            PersonalName name = new PersonalName();
            name.setFirstName("Wile");
            name.setSurname("Coyote");
            name.setSurnamePrefix("E.");
            name.setTitle("Mr.");

            PersonalInformation personalInformation = new PersonalInformation();
            personalInformation.setDateOfBirth("19490917");
            personalInformation.setGender("male");
            personalInformation.setName(name);

            Customer customer = new Customer();
            customer.setAccountType("none");
            customer.setBillingAddress(billingAddress);
            customer.setCompanyInformation(companyInformation);
            customer.setContactDetails(contactDetails);
            customer.setDevice(device);
            customer.setLocale("en_US");
            customer.setMerchantCustomerId("1234");
            customer.setPersonalInformation(personalInformation);

            OrderInvoiceData invoiceData = new OrderInvoiceData();
            invoiceData.setInvoiceDate("20140306191500");
            invoiceData.setInvoiceNumber("000000123");

            OrderReferences references = new OrderReferences();
            references.setDescriptor("Fast and Furry-ous");
            references.setInvoiceData(invoiceData);
            references.setMerchantOrderId(123456L);
            references.setMerchantReference("AcmeOrder0001");

            PersonalName shippingName = new PersonalName();
            shippingName.setFirstName("Road");
            shippingName.setSurname("Runner");
            shippingName.setTitle("Miss");

            AddressPersonal address = new AddressPersonal();
            address.setAdditionalInfo("Suite II");
            address.setCity("Monument Valley");
            address.setCountryCode("US");
            address.setHouseNumber("1");
            address.setName(shippingName);
            address.setState("Utah");
            address.setStreet("Desertroad");
            address.setZip("84536");

            Shipping shipping = new Shipping();
            shipping.setAddress(address);

            List<LineItem> items = new ArrayList<>();

            AmountOfMoney item1AmountOfMoney = new AmountOfMoney();
            item1AmountOfMoney.setAmount(2500L);
            item1AmountOfMoney.setCurrencyCode("EUR");

            LineItemInvoiceData item1InvoiceData = new LineItemInvoiceData();
            item1InvoiceData.setDescription("ACME Super Outfit");
            item1InvoiceData.setNrOfItems("1");
            item1InvoiceData.setPricePerItem(2500L);

            LineItem item1 = new LineItem();
            item1.setAmountOfMoney(item1AmountOfMoney);
            item1.setInvoiceData(item1InvoiceData);

            items.add(item1);

            AmountOfMoney item2AmountOfMoney = new AmountOfMoney();
            item2AmountOfMoney.setAmount(480L);
            item2AmountOfMoney.setCurrencyCode("EUR");

            LineItemInvoiceData item2InvoiceData = new LineItemInvoiceData();
            item2InvoiceData.setDescription("Aspirin");
            item2InvoiceData.setNrOfItems("12");
            item2InvoiceData.setPricePerItem(40L);

            LineItem item2 = new LineItem();
            item2.setAmountOfMoney(item2AmountOfMoney);
            item2.setInvoiceData(item2InvoiceData);

            items.add(item2);

            ShoppingCart shoppingCart = new ShoppingCart();
            shoppingCart.setItems(items);

            Order order = new Order();
            order.setAmountOfMoney(amountOfMoney);
            order.setCustomer(customer);
            order.setReferences(references);
            order.setShipping(shipping);
            order.setShoppingCart(shoppingCart);

            CreatePaymentRequest body = new CreatePaymentRequest();
            body.setCardPaymentMethodSpecificInput(cardPaymentMethodSpecificInput);
            body.setOrder(order);

            try {
                CreatePaymentResponse response = client.v1().merchant("merchantId").payments().create(body);
            } catch (DeclinedPaymentException e) {
                handleDeclinedPayment(e.getCreatePaymentResult());
            } catch (ApiException e) {
                handleErrorResponse(e.getErrorId(), e.getErrors());
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
    private void handleDeclinedPayment(CreatePaymentResult createPaymentResult) {
        // handle the result here
    }

    @SuppressWarnings("unused")
    private void handleErrorResponse(String errorId, List<APIError> errors) {
        // handle the error response here
    }
}

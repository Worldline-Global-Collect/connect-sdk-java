package com.worldline.connect.sdk.java.authentication;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.startsWith;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.worldline.connect.sdk.java.communication.RequestHeader;

class V1HMACAuthenticatorTest {

    @Test
    void testToCanonicalizeHeaderValue() {

        assertEquals("foo bar", V1HMACAuthenticator.toCanonicalizeHeaderValue("foo\nbar  "));
        assertEquals("foo bar", V1HMACAuthenticator.toCanonicalizeHeaderValue(" foo\r\n  bar"));
    }

    @Test
    void testToDataToSign() {

        V1HMACAuthenticator authenticator = new V1HMACAuthenticator("apiKeyId", "secretApiKey");
        List<RequestHeader> httpHeaders = new ArrayList<>();
        httpHeaders.add(new RequestHeader("X-GCS-ServerMetaInfo", "{\"platformIdentifier\":\"Windows 7/6.1 Java/1.7 (Oracle Corporation; Java HotSpot(TM) 64-Bit Server VM; 1.7.0_45)\",\"sdkIdentifier\":\"1.0\"}"));
        httpHeaders.add(new RequestHeader("Content-Type",           "application/json"));
        httpHeaders.add(new RequestHeader("X-GCS-ClientMetaInfo", "{\"foo\",\"bar\"}"));
        httpHeaders.add(new RequestHeader("User-Agent",           "Apache-HttpClient/4.3.4 (java 1.5)"));
        httpHeaders.add(new RequestHeader("Date",                   "Mon, 07 Jul 2014 12:12:40 GMT"));
        String dataToSign = authenticator.toDataToSign("POST", URI.create("http://localhost:8080/v1/9991/services%20bla/convert/amount?foo=bar&mies=no%20bar"), httpHeaders);

        String expectedStart = "POST\n"
                + "application/json\n"
        ;
        String expectedEnd = "x-gcs-clientmetainfo:{\"foo\",\"bar\"}\n"
                + "x-gcs-servermetainfo:{\"platformIdentifier\":\"Windows 7/6.1 Java/1.7 (Oracle Corporation; Java HotSpot(TM) 64-Bit Server VM; 1.7.0_45)\",\"sdkIdentifier\":\"1.0\"}\n"
                + "/v1/9991/services%20bla/convert/amount?foo=bar&mies=no bar\n"
        ;

        assertThat(dataToSign, startsWith(expectedStart));
        assertThat(dataToSign, endsWith(expectedEnd));
    }

    @Test
    void testCreateAuthenticationSignature() {

        V1HMACAuthenticator authenticator = new V1HMACAuthenticator("apiKeyId", "secretApiKey");

        String dataToSign = "DELETE\n"
                + "application/json\n"
                + "Fri, 06 Jun 2014 13:39:43 GMT\n"
                + "x-gcs-clientmetainfo:processed header value\n"
                + "x-gcs-customerheader:processed header value\n"
                + "x-gcs-servermetainfo:processed header value\n"
                + "/v1/9991/tokens/123456789\n";

        String authenticationSignature = authenticator.createAuthenticationSignature(dataToSign);

        assertEquals("VfnXpPBQQoHZivTcAg0JvOWkhnzlPnaCPKpTQn/uMJM=", authenticationSignature);
    }

    @Test
    void testCreateAuthenticationSignature2() {

        V1HMACAuthenticator authenticator = new V1HMACAuthenticator("EC36A74A98D21", "6Kj5HT0MQKC6D8eb7W3lTg71kVKVDSt1");

        String dataToSign = "GET\n"
                + "\n"
                + "Fri, 06 Jun 2014 13:39:43 GMT\n"
                + "/v1/9991/tokens/123456789\n";

        String authenticationSignature = authenticator.createAuthenticationSignature(dataToSign);

        assertEquals("9ond5EIN05dBXJGCLRK5om9pxHsyrh/12pZJ7bvmwNM=", authenticationSignature);
    }

    @Test
    void testCreateAuthenticationSignatureFromApiReference1() {

        V1HMACAuthenticator authenticator = new V1HMACAuthenticator("5e45c937b9db33ae", "I42Zf4pVnRdroHfuHnRiJjJ2B6+22h0yQt/R3nZR8Xg=");

        String dataToSign = "GET\n"
                + "\n"
                + "Fri, 06 Jun 2014 13:39:43 GMT\n"
                + "/v1/9991/tokens/123456789\n";

        String authenticationSignature = authenticator.createAuthenticationSignature(dataToSign);

        assertEquals("J5LjfSBvrQNhu7gG0gvifZt+IWNDReGCmHmBmth6ueI=", authenticationSignature);
    }

    @Test
    void testCreateAuthenticationSignatureFromApiReference2() {

        V1HMACAuthenticator authenticator = new V1HMACAuthenticator("5e45c937b9db33ae", "I42Zf4pVnRdroHfuHnRiJjJ2B6+22h0yQt/R3nZR8Xg=");

        String dataToSign = "GET\n"
                + "\n"
                + "Fri, 06 Jun 2014 13:39:43 GMT\n"
                + "/v1/consumer/ANDR%C3%89E/?q=na%20me\n";

        String authenticationSignature = authenticator.createAuthenticationSignature(dataToSign);

        assertEquals("3XV7LMYus9q7fp87/D4Qih2bKNtz20iqsttdrgJ09AU=", authenticationSignature);

        dataToSign = dataToSign.replace("%20", " ");

        authenticationSignature = authenticator.createAuthenticationSignature(dataToSign);

        assertEquals("x9S2hQmLhLTbpK0YdTuYCD8TB4D+Kf60tNW0Xw5Xls0=", authenticationSignature);
    }

    @Test
    void testCreateAuthenticationSignatureFromApiReference3() {

        V1HMACAuthenticator authenticator = new V1HMACAuthenticator("5e45c937b9db33ae", "I42Zf4pVnRdroHfuHnRiJjJ2B6+22h0yQt/R3nZR8Xg=");

        String dataToSign = "DELETE\n"
                + "application/json\n"
                + "Fri, 06 Jun 2014 13:39:43 GMT\n"
                + "x-gcs-clientmetainfo:processed header value\n"
                + "x-gcs-customerheader:processed header value\n"
                + "x-gcs-servermetainfo:processed header value\n"
                + "/v1/9991/tokens/123456789\n";

        String authenticationSignature = authenticator.createAuthenticationSignature(dataToSign);

        assertEquals("jGWLz3ouN4klE+SkqO5gO+KkbQNM06Rric7E3dcfmqw=", authenticationSignature);
    }
}

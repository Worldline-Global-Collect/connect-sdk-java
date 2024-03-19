package com.worldline.connect.sdk.java.communication;

import static com.worldline.connect.sdk.java.communication.RequestHeader.normalizeValue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RequestHeaderTest {

    @Test
    void testNormalizeValue() {
        assertEquals("foo bar", normalizeValue("foo\nbar  "));
        assertEquals("foo bar", normalizeValue(" foo\r\n  bar"));
        assertEquals("some value    with  some  spaces", normalizeValue(" some value  \r\n \n with  some \r\n  spaces "));
    }
}

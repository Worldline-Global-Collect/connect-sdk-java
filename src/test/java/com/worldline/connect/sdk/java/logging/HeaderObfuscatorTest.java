package com.worldline.connect.sdk.java.logging;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class HeaderObfuscatorTest {

    @Nested
    @TestInstance(Lifecycle.PER_CLASS)
    class ObfuscateHeader {

        @ParameterizedTest
        @MethodSource("defaultObfuscatorArgs")
        void testDefaultObfuscator(String headerName, String originalValue, String expectedObfuscatedValue) {
            String obfuscatedValue = HeaderObfuscator.defaultObfuscator()
                    .obfuscateHeader(headerName, originalValue);

            assertEquals(expectedObfuscatedValue, obfuscatedValue);
        }

        Arguments[] defaultObfuscatorArgs() {
            return new Arguments[] {
                    arguments("Authorization", "Basic QWxhZGRpbjpPcGVuU2VzYW1l", "********"),
                    arguments("authorization", "Basic QWxhZGRpbjpPcGVuU2VzYW1l", "********"),
                    arguments("AUTHORIZATION", "Basic QWxhZGRpbjpPcGVuU2VzYW1l", "********"),

                    arguments("X-GCS-Authentication-Token", "foobar", "********"),
                    arguments("x-gcs-authentication-token", "foobar", "********"),
                    arguments("X-GCS-AUTHENTICATION-TOKEN", "foobar", "********"),

                    arguments("X-GCS-CallerPassword", "foobar", "********"),
                    arguments("x-gcs-callerpassword", "foobar", "********"),
                    arguments("X-GCS-CALLERPASSWORD", "foobar", "********"),

                    arguments("Content-Type", "application/json", "application/json"),
                    arguments("content-type", "application/json", "application/json"),
                    arguments("CONTENT-TYPE", "application/json", "application/json"),
            };
        }

        @ParameterizedTest
        @MethodSource("customObfuscatorArgs")
        void testCustomObfuscator(HeaderObfuscator headerObfuscator, String headerName, String originalValue, String expectedObfuscatedValue) {
            String obfuscatedValue = headerObfuscator.obfuscateHeader(headerName, originalValue);

            assertEquals(expectedObfuscatedValue, obfuscatedValue);
        }

        Arguments[] customObfuscatorArgs() {
            HeaderObfuscator headerObfuscator = HeaderObfuscator.custom()
                    .obfuscateAll("content-type")
                    .build();

            return new Arguments[] {
                    arguments(headerObfuscator, "Authorization", "Basic QWxhZGRpbjpPcGVuU2VzYW1l", "********"),
                    arguments(headerObfuscator, "authorization", "Basic QWxhZGRpbjpPcGVuU2VzYW1l", "********"),
                    arguments(headerObfuscator, "AUTHORIZATION", "Basic QWxhZGRpbjpPcGVuU2VzYW1l", "********"),

                    arguments(headerObfuscator, "X-GCS-Authentication-Token", "foobar", "********"),
                    arguments(headerObfuscator, "x-gcs-authentication-token", "foobar", "********"),
                    arguments(headerObfuscator, "X-GCS-AUTHENTICATION-TOKEN", "foobar", "********"),

                    arguments(headerObfuscator, "X-GCS-CallerPassword", "foobar", "********"),
                    arguments(headerObfuscator, "x-gcs-callerpassword", "foobar", "********"),
                    arguments(headerObfuscator, "X-GCS-CALLERPASSWORD", "foobar", "********"),

                    arguments(headerObfuscator, "Content-Type", "application/json", "****************"),
                    arguments(headerObfuscator, "content-type", "application/json", "****************"),
                    arguments(headerObfuscator, "CONTENT-TYPE", "application/json", "****************"),
            };
        }
    }
}

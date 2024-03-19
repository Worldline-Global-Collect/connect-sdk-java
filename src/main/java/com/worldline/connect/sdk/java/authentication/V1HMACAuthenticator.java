package com.worldline.connect.sdk.java.authentication;

import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import com.worldline.connect.sdk.java.communication.RequestHeader;

/**
 * {@link Authenticator} implementation using v1HMAC signatures.
 */
public class V1HMACAuthenticator implements Authenticator {

    private static final Charset CHARSET = StandardCharsets.UTF_8;

    private static final String HMAC_ALGORITHM = "HmacSHA256";
    private static final Pattern CANONICALIZE_HEADER_REGEXP = Pattern.compile("\r?\n[\\s&&[^\r\n]]*");

    private static final Comparator<RequestHeader> REQUEST_HEADER_COMPARATOR =
            (header1, header2) -> header1.getName().compareTo(header2.getName());

    private final String apiKeyId;

    private final String secretApiKey;

    /**
     * @param apiKeyId
     *            An identifier for the secret API key. The {@code apiKeyId} can
     *            be retrieved from the Configuration Center. This identifier is
     *            visible in the HTTP request and is also used to identify the
     *            correct account.
     * @param secretApiKey
     *            A shared secret. The shared secret can be retrieved from the
     *            Configuration Center. An {@code apiKeyId} and
     *            {@code secretApiKey} always go hand-in-hand, the difference is
     *            that {@code secretApiKey} is never visible in the HTTP
     *            request. This secret is used as input for the HMAC algorithm.
     */
    public V1HMACAuthenticator(String apiKeyId, String secretApiKey) {
        if (secretApiKey == null || secretApiKey.trim().isEmpty()) {
            throw new IllegalArgumentException("secretApiKey is required");
        }
        if (apiKeyId == null || apiKeyId.trim().isEmpty()) {
            throw new IllegalArgumentException("apiKeyId is required");
        }
        this.apiKeyId = apiKeyId;
        this.secretApiKey = secretApiKey;
    }

    @Override
    public String getAuthorization(String httpMethod, URI resourceUri, List<RequestHeader> httpHeaders) {
        if (httpMethod == null || httpMethod.trim().isEmpty()) {
            throw new IllegalArgumentException("httpMethod is required");
        }
        if (resourceUri == null) {
            throw new IllegalArgumentException("resourceUri is required");
        }

        String dataToSign = toDataToSign(httpMethod, resourceUri, httpHeaders);
        return "GCS v1HMAC:" + apiKeyId + ":" + createAuthenticationSignature(dataToSign);
    }

    String toDataToSign(String httpMethod, URI resourceUri, List<RequestHeader> httpHeaders) {
        String contentType = null;
        String date = null;
        String canonicalizedResource = toCanonicalizedResource(resourceUri);

        List<RequestHeader> xgcsHttpHeaders = new ArrayList<>();

        if (httpHeaders != null) {

            for (RequestHeader httpHeader : httpHeaders) {
                if ("Content-Type".equalsIgnoreCase(httpHeader.getName())) {
                    contentType = httpHeader.getValue();
                } else if ("Date".equalsIgnoreCase(httpHeader.getName())) {
                    date = httpHeader.getValue();
                } else {
                    String name = toCanonicalizeHeaderName(httpHeader.getName());
                    if (name.startsWith("x-gcs")) {
                        String value =  toCanonicalizeHeaderValue(httpHeader.getValue());
                        RequestHeader xgcsHttpHeader = new RequestHeader(name, value);
                        xgcsHttpHeaders.add(xgcsHttpHeader);
                    }
                }
            }
        }

        Collections.sort(xgcsHttpHeaders, REQUEST_HEADER_COMPARATOR);

        StringBuilder sb = new StringBuilder(100);
        sb.append(httpMethod.toUpperCase()).append('\n');
        if (contentType != null) {
            sb.append(contentType).append('\n');
        } else {
            sb.append('\n');
        }
        sb.append(date).append('\n');
        for (RequestHeader xgcsHttpHeader : xgcsHttpHeaders) {
            sb.append(xgcsHttpHeader.getName()).append(':').append(xgcsHttpHeader.getValue()).append('\n');
        }
        sb.append(canonicalizedResource).append('\n');

        return sb.toString();
    }

    /**
     * Returns the encoded URI path without the HTTP method and including all
     * decoded query parameters.
     */
    private static String toCanonicalizedResource(URI resourceUri) {
        String rawPath = resourceUri.getRawPath();
        if (resourceUri.getQuery() == null) {
            return rawPath;
        }

        return rawPath + '?' + resourceUri.getQuery();
    }

    private static String toCanonicalizeHeaderName(String originalName) {
        return originalName.toLowerCase(Locale.ENGLISH);
    }

    static String toCanonicalizeHeaderValue(String originalValue) {
        if (originalValue == null) {
            return "";
        }

        return CANONICALIZE_HEADER_REGEXP.matcher(originalValue).replaceAll(" ").trim();
    }

    /*
     * For now V1HMAC is the only supported AuthorizationType so always use the same logic.
     */
    String createAuthenticationSignature(String dataToSign) {
        try {
            Mac sha256Hmac = Mac.getInstance(HMAC_ALGORITHM);
            SecretKeySpec secretKey = new SecretKeySpec(secretApiKey.getBytes(CHARSET), HMAC_ALGORITHM);
            sha256Hmac.init(secretKey);

            byte[] unencodedResult = sha256Hmac.doFinal(dataToSign.getBytes(CHARSET));
            return Base64.getEncoder().encodeToString(unencodedResult);

        } catch (NoSuchAlgorithmException e) {
            // should not happen, this hardcoded MAC is included by default
            throw new IllegalStateException("No such HMAC algorithm " + HMAC_ALGORITHM, e);
        } catch (InvalidKeyException e) {
            throw new IllegalStateException("Invalid HMAC key", e);
        }
    }
}

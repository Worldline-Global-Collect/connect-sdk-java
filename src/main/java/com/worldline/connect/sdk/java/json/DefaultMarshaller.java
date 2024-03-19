package com.worldline.connect.sdk.java.json;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

/**
 * {@link Marshaller} implementation based on {@link Gson}.
 */
public class DefaultMarshaller implements Marshaller {

    // Gson instances are thread-safe, so reuse one single instance
    private static final Gson GSON = new Gson();

    private static final Charset CHARSET = StandardCharsets.UTF_8;

    public static final DefaultMarshaller INSTANCE = new DefaultMarshaller();

    protected DefaultMarshaller() {
    }

    @Override
    public String marshal(Object requestObject) {
        return GSON.toJson(requestObject);
    }

    @Override
    public <T> T unmarshal(String responseJson, Class<T> type) {
        try {
            return GSON.fromJson(responseJson, type);
        } catch (JsonSyntaxException e) {
            throw new MarshallerSyntaxException(e);
        }
    }

    @Override
    public <T> T unmarshal(InputStream responseJson, Class<T> type) {
        try {
            return GSON.fromJson(new InputStreamReader(responseJson, CHARSET), type);
        } catch (JsonSyntaxException e) {
            throw new MarshallerSyntaxException(e);
        }
    }
}

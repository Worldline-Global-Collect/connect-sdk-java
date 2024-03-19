package com.worldline.connect.sdk.java.communication;

/**
 * Indicates an exception regarding the communication with the Worldline Global Collect platform such as a connection exception.
 */
@SuppressWarnings("serial")
public class CommunicationException extends RuntimeException {

    public CommunicationException(Exception e) {
        super(e);
    }
}

package com.demo.antizha.util;

/**
 * Exception thrown if an attempt is made to decode invalid data, or some other failure occurs.
 */
public class DecoderException
        extends IllegalStateException {
    private final Throwable cause;

    DecoderException(String msg, Throwable cause) {
        super(msg);

        this.cause = cause;
    }

    public Throwable getCause() {
        return cause;
    }
}
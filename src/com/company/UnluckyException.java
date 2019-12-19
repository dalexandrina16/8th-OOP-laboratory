package com.company;

public class UnluckyException extends Exception {
    private String message;
    UnluckyException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

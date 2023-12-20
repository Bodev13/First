package com.company.exceptions;

public class DogIsNotReadyException extends Exception {
    public DogIsNotReadyException(String message) {
        super(message);
    }
}

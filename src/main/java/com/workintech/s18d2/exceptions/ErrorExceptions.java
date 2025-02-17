package com.workintech.s18d2.exceptions;

import org.springframework.http.HttpStatus;

public class ErrorExceptions extends RuntimeException {

    private HttpStatus status;

    public ErrorExceptions(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }

    public HttpStatus getHttpStatus() {
        return status;
    }

    public void setHttpStatus(HttpStatus status) {
        this.status = status;
    }
}
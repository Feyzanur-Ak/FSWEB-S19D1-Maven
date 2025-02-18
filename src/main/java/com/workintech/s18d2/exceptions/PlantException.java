package com.workintech.s18d2.exceptions;

import org.springframework.http.HttpStatus;

public class PlantException extends RuntimeException {

    private HttpStatus status;

    public PlantException(String message, HttpStatus status) {
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
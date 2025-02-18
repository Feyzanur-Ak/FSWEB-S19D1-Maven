package com.workintech.s18d2.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalHandler {

    @ExceptionHandler(PlantException.class)
    public ResponseEntity<ErrorResponse> handlerExceptions(PlantException errorExceptions) {
        ErrorResponse errorResponse = new ErrorResponse(
                errorExceptions.getHttpStatus().value(),
                errorExceptions.getMessage(),
                System.currentTimeMillis()
        );

        return ResponseEntity
                .status(errorExceptions.getHttpStatus().value())
                .body(errorResponse);
    }
}
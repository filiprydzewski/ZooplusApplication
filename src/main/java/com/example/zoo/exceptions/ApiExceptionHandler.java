package com.example.zoo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class ApiExceptionHandler {
    @ExceptionHandler(value = {ApiException.class})
    public ResponseEntity<Object> handleApiRequestException(ApiException e){
        Exception exception = new Exception(
                e.getMessage(),
                e,
                HttpStatus.BAD_REQUEST,
                ZonedDateTime.now(ZoneId.of("Z"))
        );
    return new ResponseEntity<>(exception, HttpStatus.BAD_REQUEST);

    }

}

package com.prokhnov.spring.rest_srm.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerRestExceptionHandler {

    // Add an exception handler for CustomerNotFoundException
    @ExceptionHandler
    public ResponseEntity<CustomerErrorResponse> handleException(CustomerNotFoundException exc) {

        // create CustomerErrorResponse object
        CustomerErrorResponse customerErrorResponse = new CustomerErrorResponse();
        customerErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        customerErrorResponse.setMessage(exc.getMessage());
        customerErrorResponse.setTimeStamp(System.currentTimeMillis());

        // return ResponseEntity
        return new ResponseEntity<>(customerErrorResponse, HttpStatus.NOT_FOUND);
    }

    // Add another exception handler ... to catch any exception (catch all)

    @ExceptionHandler
    public ResponseEntity<CustomerErrorResponse> handleException(Exception exc) {

        CustomerErrorResponse studentErrorResponse = new CustomerErrorResponse();
        studentErrorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        studentErrorResponse.setMessage(exc.getMessage());
        studentErrorResponse.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(studentErrorResponse, HttpStatus.BAD_REQUEST);
    }

}

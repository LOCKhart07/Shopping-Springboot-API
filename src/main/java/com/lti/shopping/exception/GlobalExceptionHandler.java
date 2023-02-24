package com.lti.shopping.exception;

import com.lti.shopping.model.Product;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<Product> handleEmployeeNotFoundException(ProductNotFoundException e) {
        HttpStatus httpStatus = HttpStatus.NOT_FOUND;
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("message", e.getMessage());
        return new ResponseEntity<>(null, httpHeaders, httpStatus);
    }

}

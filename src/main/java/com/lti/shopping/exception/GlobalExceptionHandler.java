package com.lti.springbootdemo.exception;

import com.lti.springbootdemo.model.Employee;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<Employee> handleEmployeeNotFoundException(EmployeeNotFoundException e) {
        HttpStatus httpStatus = HttpStatus.NOT_FOUND;
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("message", e.getMessage());
        return new ResponseEntity<>(null, httpHeaders, httpStatus);
    }

}

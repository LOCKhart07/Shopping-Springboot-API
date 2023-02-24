package com.lti.shopping.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @RequestMapping(value = "/get-all-products/", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List> getAllProducts(){
        HttpStatus httpStatus = HttpStatus.FOUND;
//        return ResponseEntity;
    }
}

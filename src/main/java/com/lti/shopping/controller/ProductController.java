package com.lti.shopping.controller;

import com.lti.shopping.model.Product;
import com.lti.shopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    ProductService productService;

//  http://127.0.0.1:6969/products/get-all-products
    @RequestMapping(value = {"/get-all-products/", "/get-all-products"}, method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        HttpStatus httpStatus = HttpStatus.FOUND;
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Message", "Output all products");
        return new ResponseEntity<>(products, httpHeaders, httpStatus);
//        return ResponseEntity;
    }
}

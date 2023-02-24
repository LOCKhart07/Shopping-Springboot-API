package com.lti.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.shopping.model.Product;
import com.lti.shopping.service.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    static {
        System.out.println("Called");
    }

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
    }

    @RequestMapping(value = "/add-product", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<Product> addEmployee(@RequestBody Product product) {
        HttpStatus httpStatus = HttpStatus.OK;
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Message", "Product added successfully!");
        return new ResponseEntity<>(productService.addProduct(product), httpHeaders, httpStatus);
    }

}

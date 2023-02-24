package com.lti.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.lti.shopping.model.Product;
import com.lti.shopping.service.ProductService;

@RestController
@RequestMapping(value = {"/products/", "/products"})
public class ProductController {

    @Autowired
    ProductService productService;

    //  http://127.0.0.1:8069/api/products
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        HttpStatus httpStatus = HttpStatus.FOUND;
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Message", "Output all products");
        return new ResponseEntity<>(products, httpHeaders, httpStatus);
    }

    //  http://127.0.0.1:8069/api/products
    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<Product> addEmployee(@RequestBody Product product) {
        HttpStatus httpStatus = HttpStatus.OK;
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Message", "Product added successfully!");
        return new ResponseEntity<>(productService.addProduct(product), httpHeaders, httpStatus);
    }

    @RequestMapping(value = {"{product_id}"}, method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Product> outputOneEmployeeById(@PathVariable(name = "product_id") int productID) {
        Product product = productService.getProductByID(productID);
        HttpStatus httpStatus = HttpStatus.FOUND;
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Message", "Here is the product");

        return new ResponseEntity<>(product, httpHeaders, httpStatus);
    }
}

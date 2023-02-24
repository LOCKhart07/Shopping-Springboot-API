package com.lti.shopping.service;

import com.lti.shopping.model.Product;
import com.lti.shopping.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts(){
        List<Product> products =productRepository.findAll();
        LOGGER.info(products.toString());
        return products;
    }

    public Product addProduct(){

    }

}
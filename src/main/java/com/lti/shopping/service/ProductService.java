package com.lti.shopping.service;

import com.lti.shopping.model.Category;
import com.lti.shopping.model.Product;
import com.lti.shopping.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts(){
        List<Product> products =productRepository.findAll();
        LOGGER.info(products.toString());
        return products;
    }

    @Override
    public Product getProductByID(int id) {
        return null;
    }

    @Override
    public List getProductsByCategory(Category category) {
        return null;
    }

    @Override
    public Product addProduct(Product product) {
        return null;
    }


}
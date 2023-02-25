package com.lti.shopping.service;

import com.lti.shopping.model.Category;
import com.lti.shopping.model.Product;

import java.util.List;

public interface IProductService {
    List getAllProducts();

    Product getProductByID(int id);

    List getProductsByCategory(Category category);

    Product addProduct(Product product);

    Product removeProductByID(int id);

    Product updateProduct(Product product);
}

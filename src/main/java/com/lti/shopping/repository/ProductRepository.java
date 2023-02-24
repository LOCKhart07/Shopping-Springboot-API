package com.lti.shopping.repository;

import com.lti.shopping.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
//    Abhi keliye kuch nahi
}

package com.lti.shopping.repository;

import com.lti.shopping.model.Category;
import com.lti.shopping.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
// itna hi bas he
}

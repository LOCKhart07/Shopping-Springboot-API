package com.lti.shopping.service;

import com.lti.shopping.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements  ICategoryService{
    @Override
    public List getAllCategories() {
        return null;
    }

    @Override
    public Category addCatergory(Category category) {
        return null;
    }

    @Override
    public Category getCategoryId(int id) {
        return null;
    }

    @Override
    public Category updateCategory(int id, String name, String imageUrl) {
        return null;
    }



}

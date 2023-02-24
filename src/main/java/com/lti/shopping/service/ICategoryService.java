package com.lti.shopping.service;

import com.lti.shopping.model.Category;

import java.util.List;

public interface ICategoryService {
List getAllCategories();
Category addCatergory(Category category);
Category getCategoryId(int id);
Category updateCategory(int id, String name, String imageUrl);


}




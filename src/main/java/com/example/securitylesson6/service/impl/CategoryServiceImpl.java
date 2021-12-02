package com.example.securitylesson6.service.impl;

import com.example.securitylesson6.repository.CategoryRepository;
import com.example.securitylesson6.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

}

package com.example.coursespring.services;

import com.example.coursespring.entities.Category;
import com.example.coursespring.entities.Order;
import com.example.coursespring.repositories.CategoryRepository;
import com.example.coursespring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj=repository.findById(id);
        return obj.get();
    }
}

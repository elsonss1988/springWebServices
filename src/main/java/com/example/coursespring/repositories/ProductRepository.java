package com.example.coursespring.repositories;

import com.example.coursespring.entities.Category;
import com.example.coursespring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}

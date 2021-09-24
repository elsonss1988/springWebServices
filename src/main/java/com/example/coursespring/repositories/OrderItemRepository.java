package com.example.coursespring.repositories;

import com.example.coursespring.entities.Category;
import com.example.coursespring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}

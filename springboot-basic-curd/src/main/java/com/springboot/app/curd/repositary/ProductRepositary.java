package com.springboot.app.curd.repositary;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.app.curd.entity.Product;

public interface ProductRepositary extends JpaRepository<Product, Integer>{


	Optional<Product> findByName(String name);

}

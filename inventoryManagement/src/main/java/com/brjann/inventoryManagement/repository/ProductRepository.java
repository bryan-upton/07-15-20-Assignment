package com.brjann.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.brjann.inventoryManagement.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {}
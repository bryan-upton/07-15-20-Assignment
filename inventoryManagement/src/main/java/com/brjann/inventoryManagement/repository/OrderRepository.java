package com.brjann.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.brjann.inventoryManagement.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {}
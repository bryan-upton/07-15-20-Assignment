package com.brjann.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.brjann.inventoryManagement.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {}
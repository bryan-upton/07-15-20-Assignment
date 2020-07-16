package com.brjann.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.brjann.inventoryManagement.entity.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {}

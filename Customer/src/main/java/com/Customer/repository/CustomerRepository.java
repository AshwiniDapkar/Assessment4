package com.Customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}

package com.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {


}

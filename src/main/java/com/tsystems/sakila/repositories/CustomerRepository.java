package com.tsystems.sakila.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsystems.sakila.domain.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {

}

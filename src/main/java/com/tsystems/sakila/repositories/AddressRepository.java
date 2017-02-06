package com.tsystems.sakila.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsystems.sakila.domain.AddressEntity;

public interface AddressRepository extends JpaRepository<AddressEntity, Integer> {

}

package com.tsystems.sakila.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsystems.sakila.domain.RentalEntity;

public interface RentalRepository extends JpaRepository<RentalEntity, Integer> {

}

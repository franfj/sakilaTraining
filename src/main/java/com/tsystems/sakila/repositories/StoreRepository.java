package com.tsystems.sakila.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsystems.sakila.domain.StoreEntity;

public interface StoreRepository extends JpaRepository<StoreEntity, Integer> {

}

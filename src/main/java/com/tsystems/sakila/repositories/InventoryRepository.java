package com.tsystems.sakila.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsystems.sakila.domain.InventoryEntity;

public interface InventoryRepository extends JpaRepository<InventoryEntity, Integer> {

  InventoryEntity findByInventoryId(Integer id);

}

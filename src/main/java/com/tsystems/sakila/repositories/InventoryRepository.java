package com.tsystems.sakila.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tsystems.sakila.domain.InventoryEntity;

public interface InventoryRepository extends JpaRepository<InventoryEntity, Integer> {

  @Query(value = "SELECT DISTINCT store_id FROM inventory WHERE film_id=?1", nativeQuery = true)
  public List<Object> getStoreWithFilm(Integer filmId);

}

package com.tsystems.sakila.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tsystems.sakila.domain.StoreEntity;

public interface StoreRepository extends JpaRepository<StoreEntity, Integer> {

  @Query(
      value = "SELECT st.store_id,ad.address_id,ad.address,ci.city_id,ci.city FROM store st LEFT JOIN address ad ON st.address_id = ad.address_id LEFT JOIN city ci ON ad.city_id = ci.city_id",
      nativeQuery = true)
  public List<Object[]> getStoreWithAddressAndCity();

  @Query(
      value = "SELECT st.store_id,co.country FROM store st INNER JOIN address ad ON st.address_id = ad.address_id INNER JOIN city ci ON ad.city_id = ci.city_id INNER JOIN country co ON ci.country_id = co.country_id WHERE st.store_id = ?1",
      nativeQuery = true)
  public List<Object[]> getStoreWithCountry(Integer storeId);
}

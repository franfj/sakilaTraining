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


}

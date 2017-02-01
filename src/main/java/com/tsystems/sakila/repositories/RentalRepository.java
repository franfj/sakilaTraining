package com.tsystems.sakila.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tsystems.sakila.domain.RentalEntity;

public interface RentalRepository extends JpaRepository<RentalEntity, Integer> {

	@Query(value = "SELECT ren.rental_id,ren.inventory_id,pa.payment_id,cu.first_name,cu.last_name,stf.staff_id,stf.first_name AS stafffn,stf.last_name AS staffln, stf.store_id,ad.address FROM rental ren INNER JOIN payment pa ON ren.rental_id = pa.rental_id  INNER JOIN customer cu ON ren.customer_id = cu.customer_id INNER JOIN staff stf ON pa.staff_id = stf.staff_id  INNER JOIN store st ON stf.store_id = st.store_id INNER JOIN address ad ON st.address_id = ad.address_id  WHERE ren.rental_id = ?1", nativeQuery = true)
	public List<Object[]> getFullRental(Integer rentalId);
}

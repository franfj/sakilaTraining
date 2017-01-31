package com.tsystems.sakila.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tsystems.sakila.domain.PaymentEntity;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Integer> {

  @Query(value = "SELECT * FROM payment WHERE customer_id = ?1 AND amount > ?2", nativeQuery = true)
  public List<PaymentEntity> findPaymentsByCustomerAndAmountGreaterThanOne(Integer customerId,
      Integer amount);

}

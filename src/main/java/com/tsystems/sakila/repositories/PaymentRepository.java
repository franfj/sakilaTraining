package com.tsystems.sakila.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsystems.sakila.domain.PaymentEntity;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Integer> {

	PaymentEntity findById(Integer id);
}

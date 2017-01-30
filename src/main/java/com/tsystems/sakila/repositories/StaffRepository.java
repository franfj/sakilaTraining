package com.tsystems.sakila.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsystems.sakila.domain.StaffEntity;

public interface StaffRepository extends JpaRepository<StaffEntity, Integer> {

	StaffEntity findByStaffId(Integer id);
}

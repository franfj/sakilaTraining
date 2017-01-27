package com.tsystems.sakila.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsystems.sakila.domain.CityEntity;


public interface CityRepository extends JpaRepository<CityEntity, Integer> {

}

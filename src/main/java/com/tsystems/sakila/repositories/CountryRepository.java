package com.tsystems.sakila.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsystems.sakila.domain.CountryEntity;

public interface CountryRepository extends JpaRepository<CountryEntity, Long> {

}

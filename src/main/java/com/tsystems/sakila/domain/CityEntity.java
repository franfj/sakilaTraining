package com.tsystems.sakila.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(name = "city")
@Data
@ToString(of = {"id"})
@EqualsAndHashCode(of = {"id"})

public class CityEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "city")
  private String city;

  @Column(name = "country_id")
  private Integer countryId;

}


package com.tsystems.sakila.dto;

import lombok.Data;

@Data
public class City {
  private Integer id;
  private String city;
  private Integer countryId;

}

package com.tsystems.sakila.dto;

import lombok.Data;

@Data
public class Address {

  private Integer id;
  private String address;
  private String address2;
  private String district;
  private Integer cityId;
  private String postalCode;
  private String phone;
}

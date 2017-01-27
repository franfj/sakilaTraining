package com.tsystems.sakila.dto.update;

import lombok.Data;

@Data
public class UpdateAddress {

  private String address;
  private String address2;
  private String district;
  private Integer cityId;
  private String postalCode;
  private String phone;
}

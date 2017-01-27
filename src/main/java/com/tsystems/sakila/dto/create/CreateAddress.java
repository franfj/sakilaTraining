package com.tsystems.sakila.dto.create;

import lombok.Data;

@Data
public class CreateAddress {

  private String address;
  private String address2;
  private String district;
  private Long cityId;
  private String postalCode;
  private String phone;
}

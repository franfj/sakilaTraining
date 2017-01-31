package com.tsystems.sakila.dto;

import lombok.Data;

@Data
public class StoreWithAddressAndCity {

  private Integer storeId;
  private Integer addressId;
  private String address;
  private Integer cityId;
  private String city;

}

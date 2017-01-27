package com.tsystems.sakila.dto;

import lombok.Data;

@Data
public class Customer {

  private Integer customerId;
  private String firstName;
  private String lastName;
  private String email;
  private Integer addressId;
  private Integer storeId;

}

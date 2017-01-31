package com.tsystems.sakila.dto;

import lombok.Data;

@Data
public class Payment {

  private Integer id;
  private Integer customerId;
  private Integer staffId;
  private Integer rentalId;
  private Integer amount;

}

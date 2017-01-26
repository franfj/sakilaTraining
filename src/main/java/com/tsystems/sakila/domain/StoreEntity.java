package com.tsystems.sakila.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class StoreEntity {

  @Id
  @Column(name = "store_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer storeId;

  // TODO: mapear relaciones

  @Column(name = "manager_staff_id")
  private Integer managerStaffId;

  @Column(name = "address_id")
  private Integer addressId;


}

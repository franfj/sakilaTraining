package com.tsystems.sakila.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class StoreEntity {

  @Id
  @Column(name = "store_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer storeId;

  @Column(name = "manager_staff_id")
  private Integer managerStaffId;

  @Column(name = "address_id")
  private Integer addressId;

  // @ManyToMany(fetch = FetchType.LAZY, mappedBy = "staffId")
  // private StaffEntity staff;

  @ManyToOne
  @JoinColumn(name = "addresId")
  private AddressEntity address;



}

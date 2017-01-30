package com.tsystems.sakila.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "store")
public class StoreEntity {

  @Id
  @Column(name = "store_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer storeId;

  @Column(name = "manager_staff_id")
  private Integer managerStaffId;

  @ManyToOne
  @JoinColumn(name = "addressId")
  private AddressEntity address;

}

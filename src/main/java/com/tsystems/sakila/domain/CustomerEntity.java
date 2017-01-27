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

@Entity
@Table(name = "customer")
@Data
public class CustomerEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "customer_id", nullable = false)
  private Integer customerId;

  @Column(name = "first_name", nullable = false)
  private String firstName;

  @Column(name = "last_name", nullable = false)
  private String lastName;

  @Column(name = "email")
  private String email;

  @Column(name = "address_id", nullable = false)
  private Integer addressId;

  @Column(name = "store_id", nullable = false)
  private Integer storeId;

  @ManyToOne
  @JoinColumn(name = "addressId")
  private AddressEntity address;

  @ManyToOne
  @JoinColumn(name = "storeId")
  private StoreEntity rental;

}

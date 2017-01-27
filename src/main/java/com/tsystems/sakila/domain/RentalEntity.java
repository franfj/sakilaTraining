package com.tsystems.sakila.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "rental")
@Data
public class RentalEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "rental_id")
  private Long rentalId;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(columnDefinition = "inventory_id")
  private InventoryEntity inventory;

  // @ManyToMany(fetch = FetchType.LAZY, mappedBy = "paymentId")
  // private List<PaymentEntity> payments;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(columnDefinition = "customer_id")
  private CustomerEntity customer;

}

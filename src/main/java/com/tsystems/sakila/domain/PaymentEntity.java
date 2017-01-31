package com.tsystems.sakila.domain;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "payment")
public class PaymentEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "payment_id")
  private Integer id;

  // @ManyToOne(fetch = FetchType.LAZY)
  // @JoinColumn(columnDefinition = "customer_id")
  // private CustomerEntity customer;

  @Column(name = "customer_id")
  private Integer customerId;

  @Column(name = "staff_id")
  private Integer staffId;

  @Column(name = "rental_id")
  private Integer rentalId;

  // @ManyToOne(fetch = FetchType.LAZY)
  // @JoinColumn(columnDefinition = "staff_id")
  // private StaffEntity staff;
  //
  // @ManyToOne(fetch = FetchType.LAZY)
  // @JoinColumn(columnDefinition = "rental_id")
  // private RentalEntity rentalId;

  @Column(name = "amount")
  private Integer amount;

  @Column(name = "payment_date")
  private Instant paymentDate;

  @Column(name = "last_update")
  private Instant lastUpdate;

}

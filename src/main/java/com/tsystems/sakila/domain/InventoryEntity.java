package com.tsystems.sakila.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "inventory")
@Data
public class InventoryEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "inventory_id")
  private Long inventoryId;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(columnDefinition = "store_id")
  private StoreEntity store;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "rentalId")
  private RentalEntity rental;

}

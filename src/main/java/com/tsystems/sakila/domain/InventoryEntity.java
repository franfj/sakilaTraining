package com.tsystems.sakila.domain;

import java.util.List;

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

@Entity
@Table(name = "inventory")
public class InventoryEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "inventory_id")
  private Long inventoryId;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(columnDefinition = "store_id")
  private StoreEntity store;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "rentalId")
  private List<RentalEntity> rental;

  public Long getInventoryId() {
    return inventoryId;
  }

  public void setInventoryId(Long inventoryId) {
    this.inventoryId = inventoryId;
  }

  public StoreEntity getStore() {
    return store;
  }

  public void setStore(StoreEntity store) {
    this.store = store;
  }

  public List<RentalEntity> getRental() {
    return rental;
  }

  public void setRental(List<RentalEntity> rental) {
    this.rental = rental;
  }

}

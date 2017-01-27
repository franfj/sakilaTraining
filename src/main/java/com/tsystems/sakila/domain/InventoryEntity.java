package com.tsystems.sakila.domain;

@Entity
@Table(name = "inventory")
@Data
public class InventoryEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "inventory_id")
  private Long id;

  // TODO: Map StoreEntity relation

}

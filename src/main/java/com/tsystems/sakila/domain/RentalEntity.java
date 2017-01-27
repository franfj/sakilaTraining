package com.tsystems.sakila.domain;

@Entity
@Table(name = "rental")
@Data
public class RentalEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "rental_id")
  private Long id;

  // TODO: Map InventoryEntity relation

  // TODO: Map CustomerEntity relation

  // TODO: Map StaffEntity relation

}


package com.tsystems.sakila.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Entity
@Table(name = "address")
@Data
@ToString(of = {"id"})
@EqualsAndHashCode(of = {"id"})
public class AddressEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "address_id")
  private Integer id;

  @Column(name = "address")
  private String address;

  @Column(name = "address2")
  private String address2;

  @Column(name = "district")
  private String district;

  @Column(name = "city_id")
  private Integer cityId;

  @Column(name = "postal_code")
  private String postalCode;

  @Column(name = "phone")
  private String phone;

}

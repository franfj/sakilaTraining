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


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(name="city")
@Data
@ToString(of = { "id" })
@EqualsAndHashCode(of = { "id" })

public class CityEntity {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "city")
    private String city;
    
    @Column(name = "country_id")
    private Long countryId;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id")
    private CountryEntity country;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy="cityId")
    private List<AddressEntity> addresses;

}

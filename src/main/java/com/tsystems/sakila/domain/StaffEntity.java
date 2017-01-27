package com.tsystems.sakila.domain;

import java.time.Instant;

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
@Data
@Table(name = "staff")
public class StaffEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "staff_id")
	private Integer staffId;

	@Column(name = "first-_ame")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(columnDefinition = "address_id")
	@Column
	private AddressEntity addres;

	@Column(name = "email")
	private String email;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(columnDefinition = "store_id")
	@Column(name = "store_id")
	private StoreEntity store;

	@Column(name = "active")
	private Integer active;

	@Column(name = "username")
	private String userName;

	@Column(name = "password")
	private String password;

	@Column(name = "last_update")
	private Instant lastUpdate;

	public StaffEntity(Integer staffId, String firstName, String lastName, AddressEntity addres, String email,
			StoreEntity store, Integer active, String userName, String password, Instant lastUpdate) {
		super();
		this.staffId = staffId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.addres = addres;
		this.email = email;
		this.store = store;
		this.active = active;
		this.userName = userName;
		this.password = password;
		this.lastUpdate = lastUpdate;
	}

}

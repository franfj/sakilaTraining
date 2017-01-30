package com.tsystems.sakila.dto;

import com.tsystems.sakila.domain.AddressEntity;
import com.tsystems.sakila.domain.StoreEntity;

import lombok.Data;

@Data
public class Staff {

	private Integer staffId;
	private String firstName;
	private String lastName;
	private AddressEntity addres;
	private String email;
	private StoreEntity store;
	private Integer active;
	private String userName;
	private String password;

}

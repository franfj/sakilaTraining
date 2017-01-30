package com.tsystems.sakila.dto;

import com.tsystems.sakila.domain.CustomerEntity;
import com.tsystems.sakila.domain.RentalEntity;
import com.tsystems.sakila.domain.StaffEntity;

import lombok.Data;

@Data
public class Payment {

	private Integer id;
	private CustomerEntity customer;
	private StaffEntity staff;
	private RentalEntity rentalId;
	private Integer amount;

}

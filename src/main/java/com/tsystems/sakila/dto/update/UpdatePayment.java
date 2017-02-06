package com.tsystems.sakila.dto.update;

import com.tsystems.sakila.domain.CustomerEntity;
import com.tsystems.sakila.domain.RentalEntity;
import com.tsystems.sakila.domain.StaffEntity;

import lombok.Data;

@Data
public class UpdatePayment {

	private Integer id;
	private CustomerEntity customer;
	private StaffEntity staff;
	private RentalEntity rentalId;
	private Integer amount;

}

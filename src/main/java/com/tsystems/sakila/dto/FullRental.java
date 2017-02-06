package com.tsystems.sakila.dto;

import lombok.Data;

@Data
public class FullRental {

	private Integer rentalId;
	private Integer inventoryId;
	private Integer paymentId;
	private String customerFirstName;
	private String customerLastName;
	private Integer staffId;
	private String staffFirstName;
	private String staffLasstName;
	private Integer storeId;
	private String storeAddress;
}

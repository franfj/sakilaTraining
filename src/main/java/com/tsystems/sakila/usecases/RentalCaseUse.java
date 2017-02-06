package com.tsystems.sakila.usecases;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsystems.sakila.dto.FullRental;
import com.tsystems.sakila.repositories.RentalRepository;

@Component
public class RentalCaseUse {

	private final RentalRepository rentalRepository;

	@Autowired
	public RentalCaseUse(RentalRepository rentalRepository) {
		super();
		this.rentalRepository = rentalRepository;
	}

	public List<FullRental> getFullRental(Integer rentalId) {
		List<Object[]> queryResult = rentalRepository.getFullRental(rentalId);
		List<FullRental> result = new LinkedList<>();

		for (Object[] object : queryResult) {

			FullRental fullRental = new FullRental();

			fullRental.setRentalId(Integer.parseInt(object[0].toString()));
			fullRental.setInventoryId(Integer.parseInt(object[1].toString()));
			fullRental.setPaymentId(Integer.parseInt(object[2].toString()));
			fullRental.setCustomerFirstName(object[3].toString());
			fullRental.setCustomerLastName(object[4].toString());
			fullRental.setStaffId(Integer.parseInt(object[5].toString()));
			fullRental.setStaffFirstName(object[6].toString());
			fullRental.setStaffLasstName(object[7].toString());
			fullRental.setStoreId(Integer.parseInt(object[8].toString()));
			fullRental.setStoreAddress(object[9].toString());

			result.add(fullRental);
		}

		return result;
	}

}

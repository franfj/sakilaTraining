package com.tsystems.sakila.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tsystems.sakila.dto.FullRental;
import com.tsystems.sakila.usecases.RentalCaseUse;

@RestController
@RequestMapping(value = "/rental")
public class RentalController {

	public RentalCaseUse rentalCaseUse;

	@Autowired
	public RentalController(RentalCaseUse rentalCaseUse) {
		super();
		this.rentalCaseUse = rentalCaseUse;
	}

	@RequestMapping(value = "/{rentalId:\\d+}", method = RequestMethod.GET)
	public List<FullRental> getFullRental(@PathVariable(name = "rentalId", required = true) Integer rentalId) {
		return rentalCaseUse.getFullRental(rentalId);
	}

}

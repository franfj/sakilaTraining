package com.tsystems.sakila.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tsystems.sakila.dto.StoreWithAddressAndCity;
import com.tsystems.sakila.dto.StoreWithCountry;
import com.tsystems.sakila.usecases.StoreCaseUses;

@RestController
@RequestMapping(value = "/stores")
public class StoreController {

  private final StoreCaseUses storeCaseUses;

  @Autowired
  public StoreController(StoreCaseUses storesCaseUses) {
    super();
    this.storeCaseUses = storesCaseUses;
  }

  @RequestMapping(value = "/all", method = RequestMethod.GET)
  public List<StoreWithAddressAndCity> getStoreWithAddressAndCity() {
    return storeCaseUses.getStoreWithAddressAndCity();
  }

  @RequestMapping(value = "/one/{id}", method = RequestMethod.GET)
  public List<StoreWithCountry> getStoreWithAddressAndCity(@RequestParam("id") Integer storeId) {
    return storeCaseUses.getStoreWithCountry(storeId);
  }

}

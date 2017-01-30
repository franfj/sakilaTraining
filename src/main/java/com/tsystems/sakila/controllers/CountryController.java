package com.tsystems.sakila.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.tsystems.sakila.dto.create.CreateCountry;
import com.tsystems.sakila.dto.update.UpdateCountry;
import com.tsystems.sakila.usecases.CrudCountryUsercase;

@Controller
public class CountryController {


  private final CrudCountryUsercase crudCountryUsercase;

  @Autowired
  public CountryController(CrudCountryUsercase crudCountryUsercase) {
    super();
    this.crudCountryUsercase = crudCountryUsercase;
  }

  public void getCountries() {
    System.out.println(crudCountryUsercase.findAll());
  }

  public void getCountryById(Integer id) {
    System.out.println(crudCountryUsercase.getCountryById(id));
  }

  public void createCountry(CreateCountry countryToCreate) {
    System.out.println("Creado country: " + crudCountryUsercase.createNewCountry(countryToCreate));
  }

  public void updateCountry(Integer id, UpdateCountry countryToUpdate) {
    System.out
        .println("Modificado country: " + crudCountryUsercase.updateCountry(countryToUpdate, id));
  }

  public void removeCountry(Integer id) {
    System.out.println("Eliminado country: " + id);
  }

}

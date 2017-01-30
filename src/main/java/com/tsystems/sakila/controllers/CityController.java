package com.tsystems.sakila.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.tsystems.sakila.dto.create.CreateCity;
import com.tsystems.sakila.dto.update.UpdateCity;
import com.tsystems.sakila.usecases.CrudCityUsercase;

@Controller
public class CityController {

  private final CrudCityUsercase crudCityUsercase;

  @Autowired
  public CityController(CrudCityUsercase crudCityUsercase) {
    super();
    this.crudCityUsercase = crudCityUsercase;
  }

  public void getCities() {
    System.out.println(crudCityUsercase.findAll());
  }

  public void getCityById(Integer id) {
    System.out.println(crudCityUsercase.getCityById(id));
  }

  public void createCity(CreateCity cityToCreate) {
    System.out.println("Creado city: " + crudCityUsercase.createNewCity(cityToCreate));
  }

  public void updateCity(Integer id, UpdateCity cityToUpdate) {
    System.out.println("Modificado city: " + crudCityUsercase.updateCity(cityToUpdate, id));
  }

  public void removeCity(Integer id) {
    System.out.println("Eliminado city: " + id);
  }


}

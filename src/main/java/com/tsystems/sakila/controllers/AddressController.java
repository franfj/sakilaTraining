package com.tsystems.sakila.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.tsystems.sakila.dto.create.CreateAddress;
import com.tsystems.sakila.dto.update.UpdateAddress;
import com.tsystems.sakila.usecases.CrudAddressUsercase;

@Controller
public class AddressController {


  private final CrudAddressUsercase crudAddressUsercase;

  @Autowired
  public AddressController(CrudAddressUsercase crudAddressUsercase) {
    super();
    this.crudAddressUsercase = crudAddressUsercase;
  }

  public void getAddresses() {
    System.out.println(crudAddressUsercase.findAll());
  }

  public void getAddressById(Integer id) {
    System.out.println(crudAddressUsercase.getAddressById(id));
  }

  public void createAddress(CreateAddress addressToCreate) {
    System.out.println("Creado address: " + crudAddressUsercase.createNewAddress(addressToCreate));
  }

  public void updateAddress(Integer id, UpdateAddress addressToUpdate) {
    System.out
        .println("Modificado address: " + crudAddressUsercase.updateAddress(addressToUpdate, id));
  }

  public void removeAddress(Integer id) {
    System.out.println("Eliminado address: " + id);
  }



}

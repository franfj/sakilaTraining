package com.tsystems.sakila.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tsystems.sakila.dto.Customer;
import com.tsystems.sakila.usecases.CrudCustomerUseCase;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

  public final CrudCustomerUseCase crudCustomerUseCase;

  @Autowired
  public CustomerController(CrudCustomerUseCase crudCustomerUseCase) {
    super();
    this.crudCustomerUseCase = crudCustomerUseCase;
  }

  public void createCustomer(Customer customerToCreate) {

    System.out.println("Voy a crear un customer");
    crudCustomerUseCase.createCustomer(customerToCreate);

  }

  public void getCustomerById(Integer customerId) {

    System.out.println("Obtener el customer con id " + customerId + " = "
        + crudCustomerUseCase.getCustomer(customerId));

  }

  @RequestMapping(method = RequestMethod.GET)
  public void getAllCustomers() {

    System.out.println("Listado de todos los customers " + crudCustomerUseCase.getAllCustomers());

  }

  public void updateCustomer(Integer customerId, Customer customerToUpdate) {

    System.out.println("Actualizar customer con id = " + customerId);
    crudCustomerUseCase.updateCustomer(customerId, customerToUpdate);

  }

  public void delteCustomer(Integer customerId) {

    System.out.println("Borrado del customer con id = " + customerId);
    crudCustomerUseCase.deleteCustomer(customerId);

  }

}

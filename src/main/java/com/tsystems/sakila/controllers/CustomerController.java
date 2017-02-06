package com.tsystems.sakila.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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

  // @RequestMapping(value = "/{name}", method = RequestMethod.POST)
  // public ResponseEntity<Customer> createCustomer(@RequestBody Customer customerToCreate) {
  //
  // return new ResponseEntity<Customer>(crudCustomerUseCase.createCustomer(customerToCreate),
  // HttpStatus.CREATED);
  // }

  @RequestMapping(value = "/{customerId:\\d+}", method = RequestMethod.GET)
  public Customer getCustomerById(@PathVariable("customerId") Integer customerId) {

    return crudCustomerUseCase.getCustomer(customerId);
  }

  @RequestMapping(method = RequestMethod.GET)
  public List<Customer> getAllCustomers() {

    return crudCustomerUseCase.getAllCustomers();
  }

  @RequestMapping(value = "/{customerId:\\d+}", method = RequestMethod.PUT)
  public Customer updateCustomer(@PathVariable("customerId") Integer customerId,
      @RequestBody Customer customerToUpdate) {

    return crudCustomerUseCase.updateCustomer(customerId, customerToUpdate);
  }

  @RequestMapping(value = "/{customerId:\\d+}", method = RequestMethod.DELETE)
  public void delteCustomer(@PathVariable("customerId") Integer customerId) {
    crudCustomerUseCase.deleteCustomer(customerId);
  }

}

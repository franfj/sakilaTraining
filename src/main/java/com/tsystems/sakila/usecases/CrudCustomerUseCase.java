package com.tsystems.sakila.usecases;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsystems.sakila.domain.CustomerEntity;
import com.tsystems.sakila.dto.Customer;
import com.tsystems.sakila.repositories.CustomerRepository;

@Service
public class CrudCustomerUseCase {

  private final CustomerRepository customerRepository;

  @Autowired
  public CrudCustomerUseCase(CustomerRepository customerRepository) {
    super();
    this.customerRepository = customerRepository;
  }

  public Customer createCustomer(Customer customerToCreate) {

    CustomerEntity customerEntity = new CustomerEntity();

    customerEntity.setFirstName(customerToCreate.getFirstName());
    customerEntity.setLastName(customerToCreate.getLastName());
    customerEntity.setEmail(customerToCreate.getEmail());

    customerRepository.save(customerEntity);

    return customerToCreate;
  }

  public Customer getCustomer(Integer customerId) {

    CustomerEntity customerEntity = customerRepository.findOne(customerId);
    Customer customer = new Customer();

    customer.setCustomerId(customerEntity.getCustomerId());
    customer.setFirstName(customerEntity.getFirstName());
    customer.setLastName(customerEntity.getLastName());
    customer.setEmail(customerEntity.getEmail());

    return customer;
  }

  public List<Customer> getAllCustomers() {

    List<CustomerEntity> customerEntities = customerRepository.findAll();
    List<Customer> customers = new LinkedList<>();

    for (CustomerEntity customerEntity : customerEntities) {

      Customer customer = new Customer();

      customer.setCustomerId(customerEntity.getCustomerId());
      customer.setFirstName(customerEntity.getFirstName());
      customer.setLastName(customerEntity.getLastName());
      customer.setEmail(customerEntity.getEmail());

      customers.add(customer);
    }

    return customers;
  }

  public Customer updateCustomer(Integer customerId, Customer customerToUpdate) {

    CustomerEntity customerEntity = customerRepository.findOne(customerId);

    customerEntity.setCustomerId(customerId);
    customerEntity.setFirstName(customerToUpdate.getFirstName());
    customerEntity.setLastName(customerToUpdate.getLastName());
    customerEntity.setEmail(customerToUpdate.getEmail());

    customerRepository.save(customerEntity);

    return customerToUpdate;
  }

  public void deleteCustomer(Integer customerId) {

    customerRepository.delete(customerId);
  }



}

package com.tsystems.sakila.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsystems.sakila.dto.Payment;
import com.tsystems.sakila.dto.create.CreatePayment;
import com.tsystems.sakila.dto.update.UpdatePayment;
import com.tsystems.sakila.usecases.CrudPaymentUseCase;

@RestController
@RequestMapping(value = "/payments")
public class PaymentController {

  private final CrudPaymentUseCase crudPaymentUseCase;

  @Autowired
  public PaymentController(CrudPaymentUseCase crudPaymentUseCase) {
    super();
    this.crudPaymentUseCase = crudPaymentUseCase;
  }


  @RequestMapping(value = "/customer/{id}")
  public List<Payment> findPaymentsByCustomerAndAmountGreaterThanOne(
      @PathVariable("id") Integer customerId) {
    return crudPaymentUseCase.findPaymentsByCustomerAndAmountGreaterThanOne(customerId);
  }


  public void createPayment(CreatePayment PaymentToCreate) {
    System.out.println("Creando Payment");
    crudPaymentUseCase.createPayment(PaymentToCreate);
  }

  public List<Payment> getAllPayments() {
    System.out.println("Esta es la lista de todos los Payment:");
    return crudPaymentUseCase.getPayments();
  }

  public Payment getPaymentById(Integer id) {
    System.out.println("El Payment con el id:" + id + "es el siguiente: ");
    return crudPaymentUseCase.getPaymentById(id);

  }

  public void updatePayment(UpdatePayment PaymentToUpdate, Integer id) {
    System.out.println("Se procede a actualizar el Payment con id: " + id);
    crudPaymentUseCase.updatePayment(PaymentToUpdate, id);
  }

  public void deleteCustomer(Integer id) {
    System.out.println("Se procede a borrar el Payment con id: " + id);
    crudPaymentUseCase.removePayment(id);
  }

}

package com.tsystems.sakila.usecases;

import java.util.LinkedList;
import java.util.List;

import com.tsystems.sakila.domain.PaymentEntity;
import com.tsystems.sakila.dto.Payment;
import com.tsystems.sakila.dto.create.CreatePayment;
import com.tsystems.sakila.dto.update.UpdatePayment;
import com.tsystems.sakila.repositories.PaymentRepository;

public class CrudPaymentUseCase {

  private final PaymentRepository paymentRepository;

  public CrudPaymentUseCase(PaymentRepository paymentRepository) {
    super();
    this.paymentRepository = paymentRepository;
  }

  public List<Payment> getPayments() {
    List<PaymentEntity> source = paymentRepository.findAll();
    List<Payment> result = new LinkedList<>();

    for (PaymentEntity paymentEntityIterator : source) {
      Payment newPayment = new Payment();
      newPayment.setId(paymentEntityIterator.getId());
      result.add(newPayment);
    }
    return result;
  }

  public Payment getPaymentById(Integer id) {

    Payment newPayment = new Payment();
    newPayment.setId(paymentRepository.findOne(id).getId());
    return newPayment;
  }

  public void createPayment(CreatePayment paymentToCreate) {

    PaymentEntity paymentEntityToCreate = new PaymentEntity();
    paymentEntityToCreate.setId(paymentToCreate.getId());

    paymentRepository.save(paymentEntityToCreate);
  }

  public void updatePayment(UpdatePayment paymentToUpdate, Integer id) {

    PaymentEntity newPaymentEntity = paymentRepository.findOne(id);
    newPaymentEntity.setId(paymentToUpdate.getId());

    paymentRepository.save(newPaymentEntity);

  }

  public void removePayment(Integer id) {
    paymentRepository.delete(id);
  }

}

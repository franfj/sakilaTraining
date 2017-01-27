package com.tsystems.sakila.domain;

import java.time.Instant;

@Table("")
public class PaymentEntity {

	
	private Integer id;
	private Integer customerId;
	private Integer staffId;
	private Integer rentalId;
	private Integer amount;
	private Instant paymentDate;
	private Instant lastUpdate;
	
	
	public PaymentEntity(Integer id, Integer customerId, Integer staffId, Integer rentalId, Integer amount,
			Instant paymentDate, Instant lastUpdate) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.staffId = staffId;
		this.rentalId = rentalId;
		this.amount = amount;
		this.paymentDate = paymentDate;
		this.lastUpdate = lastUpdate;
	}
	
	
}

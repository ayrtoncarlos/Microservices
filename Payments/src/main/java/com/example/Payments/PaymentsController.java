package com.example.Payments;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentsController 
{
	@GetMapping("/payments/{id}/")
	public Payments getPayments(@PathVariable int id) 
	{
		Payments payment = new Payments();
		
		payment.setId(id);
		payment.setValue(6.66);
		
		return payment;
	}
}

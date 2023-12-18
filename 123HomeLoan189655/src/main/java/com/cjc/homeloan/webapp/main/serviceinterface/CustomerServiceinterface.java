package com.cjc.homeloan.webapp.main.serviceinterface;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cjc.homeloan.webapp.main.model.Customer;

public interface CustomerServiceinterface {
	
	public List<Customer> getAllCustomer();

	public Customer getSingleCustomer(Integer customerId);

	public void deleteCustomer(Integer customerId);


	public Customer saveCustomer(Customer customer);

	public Customer updateCustomer(Customer customer, Integer customerId);

	public ResponseEntity<Customer> sanctionLoan(Customer customer, Integer customerId);

	public Customer loanDisbursement(Customer customer, Integer customerId);

	public Customer sactionletteraccepted(Customer customer, Integer customerId);

	public Customer defaultCounter(Customer customer, Integer customerId);
	
	

}

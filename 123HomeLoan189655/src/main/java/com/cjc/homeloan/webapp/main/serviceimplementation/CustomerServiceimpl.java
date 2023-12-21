package com.cjc.homeloan.webapp.main.serviceimplementation;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cjc.homeloan.webapp.main.exception.ValueNotValidException;
import com.cjc.homeloan.webapp.main.model.Customer;
import com.cjc.homeloan.webapp.main.repository.CustomerRepository;
import com.cjc.homeloan.webapp.main.serviceinterface.CustomerServiceinterface;


@Service
public class CustomerServiceimpl implements CustomerServiceinterface {
	
	@Autowired
	CustomerRepository  custoRepository;
	
	
	//*************************************************************************
	
		@Override
		public Customer saveRegData(Customer rd) {
			
			return custoRepository.save(rd);
		}
		
	
	
	
	
	
	
	
	


	@Override
	public Customer saveCustomer(Customer customer) {
		      
		return custoRepository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		    
		return custoRepository.findAll();
	}

	@Override
	public Customer getSingleCustomer(Integer customerId) {
		   
		Customer cust= custoRepository.findById(customerId).get();
		return cust;
	}

	@Override
	public void deleteCustomer(Integer customerId) {
		
		custoRepository.deleteById(customerId);
		    
		
	}











	@Override
	public Customer updateCustomer(Customer customer, Integer customerId) {
		// TODO Auto-generated method stub
		return null;
	}











	@Override
	public ResponseEntity<Customer> sanctionLoan(Customer customer, Integer customerId) {
		// TODO Auto-generated method stub
		return null;
	}











	@Override
	public Customer loanDisbursement(Customer customer, Integer customerId) {
		// TODO Auto-generated method stub
		return null;
	}











	@Override
	public Customer sactionletteraccepted(Customer customer, Integer customerId) {
		// TODO Auto-generated method stub
		return null;
	}











	@Override
	public Customer defaultCounter(Customer customer, Integer customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	

}

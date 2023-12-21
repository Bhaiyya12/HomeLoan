package com.cjc.homeloan.webapp.main.controller;



import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.homeloan.webapp.main.model.AllPersonelDoc;
import com.cjc.homeloan.webapp.main.model.Customer;

import com.cjc.homeloan.webapp.main.model.Profession;
import com.cjc.homeloan.webapp.main.model.PropertyInfo;
import com.cjc.homeloan.webapp.main.serviceinterface.CustomerServiceinterface;
import com.cjc.homeloan.webapp.main.serviceinterface.EnquiryDetailsServiceI;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@CrossOrigin
@RestController
public class CustomerController {
	
	@Autowired
	CustomerServiceinterface customerServiceInterface; 
	
	@Autowired
	EnquiryDetailsServiceI enquiryDetailsServiceI;
	
	
	
	
	

	@PostMapping("/saveRegDetailsData")
	public Customer saveRegData(@RequestBody Customer rd)
	{
		System.out.println("uuuuuuuuuuuuuuuuuuuuuuuuuuu");
		Customer crd= customerServiceInterface.saveRegData(rd);
		return crd;	
	}
	
	
	
	
	
	
	
	
	
	
	

	@GetMapping(value="/customer")
	public List<Customer> getAllCustomer()
	{
		List<Customer> cust=customerServiceInterface.getAllCustomer();
		return cust;
	}
	
	@GetMapping(value="/customer/{customerId}")
	public Customer getSingleCustomer(@PathVariable("customerId")Integer customerId)
	{
		Customer cust=customerServiceInterface.getSingleCustomer(customerId);
		
		return cust;
	}
	
	@DeleteMapping(value="/customer/{customerId}")
	public String deleteCustomer(@PathVariable ("customerId")Integer customerId)
	{
		customerServiceInterface.deleteCustomer(customerId);
		
		return "Deleted Successfully";
	}
	
	
	

}




































































//System.out.println("ENQUIRY ID "+customer.getEnquiryDetails().getId());
//EnquiryDetails enq=enquiryDetailsServiceI.getSingleEnquiryDetails(customer.getEnquiryDetails().getId());
//customer.setEnquiryDetails(enq);

//customer.getAllpersonalDoc().setAddressProof(file1.getBytes());
//customer.getAllpersonalDoc().setPanCard(file2.getBytes());
//customer.getAllpersonalDoc().setIncomeTax(file3.getBytes());
//customer.getAllpersonalDoc().setAddharCard(file4.getBytes());
//customer.getAllpersonalDoc().setPhoto(file5.getBytes());
//customer.getAllpersonalDoc().setThumb(file7.getBytes());
//customer.getAllpersonalDoc().setBankCheque(file8.getBytes());
//customer.getAllpersonalDoc().setSalarySlips(file9.getBytes());
//customer.getMortgageDetails().setMortgagePropertyProof(file10.getBytes());
//customer.getMortgageDetails().setMortgagePropertyInsurance(file11.getBytes());
//customer.getProfession().setProfessionsalaryslips(file12.getBytes());
//customer.getPropertyinfo().setPropertyDocuments(file13.getBytes());
//customer.getPropertyinfo().setPriceProofs(file14.getBytes());

package com.cjc.homeloan.webapp.main.controller;



import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.cjc.homeloan.webapp.main.model.MortgageDetails;
import com.cjc.homeloan.webapp.main.model.Profession;
import com.cjc.homeloan.webapp.main.model.PropertyInfo;
import com.cjc.homeloan.webapp.main.serviceinterface.CustomerServiceinterface;
import com.cjc.homeloan.webapp.main.serviceinterface.EnquiryDetailsServiceI;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerServiceinterface customerServiceInterface; 
	
	@Autowired
	EnquiryDetailsServiceI enquiryDetailsServiceI;
	
	@PostMapping(value="/customer")
	public String saveCustomer(@RequestPart("addressProof")MultipartFile file1,
			@RequestPart("panCard")MultipartFile file2,
			@RequestPart("incomeTax")MultipartFile file3,
			@RequestPart("addharCard")MultipartFile file4,
			@RequestPart("photo")MultipartFile file5,
			@RequestPart("signature")MultipartFile file6,
			@RequestPart("thumb")MultipartFile file7,
			@RequestPart("bankCheque")MultipartFile file8,
			@RequestPart("salarySlips")MultipartFile file9,
			@RequestPart("mortgagePropertyProof")MultipartFile file10,
			@RequestPart("mortgagePropertyInsurance")MultipartFile file11,
			@RequestPart("professionsalaryslips")MultipartFile file12,
			@RequestPart("propertyDocuments")MultipartFile file13,
			@RequestPart("priceProofs")MultipartFile file14,
			@RequestPart("cust")String cust) throws JsonMappingException, JsonProcessingException
	{
		ObjectMapper objectMapper= new ObjectMapper();
		
		 Customer customer = objectMapper.readValue(cust,  Customer.class);
	    try {
	    	
	    	AllPersonelDoc apd=new AllPersonelDoc();
	    	
	    	apd.setAddharCard(file4.getBytes());
	    	apd.setAddressProof(file1.getBytes());
	    	apd.setPanCard(file2.getBytes());
	    	apd.setIncomeTax(file3.getBytes());
	    	apd.setPhoto(file5.getBytes());
	    	apd.setSignature(file6.getBytes());
	    	apd.setThumb(file7.getBytes());
	    	apd.setBankCheque(file8.getBytes());
	    	apd.setSalarySlips(file9.getBytes());
	    	System.out.println(apd); 
	    	customer.setAllpersonalDoc(apd);
	    	
	    	MortgageDetails details= new MortgageDetails();
	    	details.setMortageLoanOnProperty(customer.getMortgageDetails().getMortageLoanOnProperty());
	    	details.setMortagePropertyType(customer.getMortgageDetails().getMortagePropertyType());
	    	details.setMortagePropertyValue(customer.getMortgageDetails().getMortagePropertyValue());
	    	details.setMortagePropertyProof(file10.getBytes());
	    	details.setMortagePropertyInsurance(file11.getBytes());
	    	customer.setMortgageDetails(details);
	    	
	    	Profession pro=new Profession();
	    	pro.setProfessionSalarySlips(file12.getBytes());
	    	pro.setProfessionType(customer.getProfession().getProfessionType());
	    	pro.setProfessionDesignation(customer.getProfession().getProfessionDesignation());
	    	pro.setProfessionSalaryType(customer.getProfession().getProfessionSalaryType());
	    	pro.setProfessionSalary(customer.getProfession().getProfessionSalary());
	    	pro.setProfessionWorkingPeriod(customer.getProfession().getProfessionWorkingPeriod());
	    	customer.setProfession(pro);
	    	
	    	PropertyInfo proinfo=new PropertyInfo();
	    	proinfo.setConstructionArea(customer.getPropertyinfo().getConstructionArea());
	    	proinfo.setConstructionPrice(customer.getPropertyinfo().getConstructionPrice());
	    	proinfo.setPropertyArea(customer.getPropertyinfo().getPropertyArea());
	    	proinfo.setPropertyPrice(customer.getPropertyinfo().getPropertyPrice());
	    	proinfo.setPropertyType(customer.getPropertyinfo().getPropertyType());
	    	proinfo.setPropertyAddress(customer.getPropertyinfo().getPropertyAddress());
	    	
	    	proinfo.setPropertyDocument(file13.getBytes());
	    	proinfo.setPrizeProofs(file14.getBytes());
	    	customer.setPropertyinfo(proinfo);
	    	
	    	
//	    	
			 Customer custom= customerServiceInterface.saveCustomer(customer);
			return "saved Successfully";
			
		} catch (IOException e) {
			e.printStackTrace();
			return null;
			
		}
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
	
	
	@PutMapping(value="/customer/{customerId}")
	public String updateCustomer(@RequestBody Customer customer, @PathVariable ("customerId") Integer customerId)
	{
		

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd"); 
	    Date date = new Date();  
		customer.getCustomerverification().setVerificationDate(formatter.format(date));
		Customer custom= customerServiceInterface.updateCustomer(customer,customerId);
		return "UPADATED SUCCEEFULLY";
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

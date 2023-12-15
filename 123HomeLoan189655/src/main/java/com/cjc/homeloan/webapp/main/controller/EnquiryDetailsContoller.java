package com.cjc.homeloan.webapp.main.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.homeloan.webapp.main.model.EnquiryDetails;
import com.cjc.homeloan.webapp.main.serviceinterface.EnquiryDetailsServiceI;
@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class EnquiryDetailsContoller {
	@Autowired
	EnquiryDetailsServiceI edi;
	
	@PostMapping("/enquiry")
	public ResponseEntity<EnquiryDetails> saveEnquiryDetails(@RequestBody EnquiryDetails enqury)
	{
		EnquiryDetails eq=edi.saveEnquiryDetails(enqury);
		return new ResponseEntity<EnquiryDetails>(eq,HttpStatus.OK);
	}
	  
	@GetMapping("/enquiry/{id}")
	public ResponseEntity<EnquiryDetails> getSingleEnquiryDetails(@PathVariable int id)
	{
		EnquiryDetails e=edi.getSingleEnquiryDetails(id);
		return new ResponseEntity<EnquiryDetails>(e,HttpStatus.OK);
	}
	
	@GetMapping("/enquiry")
	public ResponseEntity<List<EnquiryDetails>> getAllEnquiryDetails()
	{
		List<EnquiryDetails> enquirys=edi.getAllEnquiryDetails();
		return new ResponseEntity<List<EnquiryDetails>>(enquirys,HttpStatus.OK);
	}
	
	@DeleteMapping("/enquiry/{id}")
	public void deleteEnquiry(@PathVariable("id") int id)
	{
		edi.deleteEnquiry(id);	 
	}
	
	@GetMapping("/enquiryy/{id}")
	public ResponseEntity<Integer> genertaeCibilScore(@PathVariable int id)
	{
		Integer e=edi.genertaeCibilScore(id);
		return new ResponseEntity<Integer>(e,HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@PutMapping("/enquiry/{id}")
//	public void editEnquiry(@PathVariable ("id") int id, @RequestBody EnquiryDetails enqury)
//	{
//		enqury.setCid(id);
//		enqury.getCibil().setRemark("APPROVED");
//		EnquiryDetails enquiryDetails=edi.editEnquiry(enqury);	 
//	}
//	
//	@PutMapping("/enquiryreject/{id}")
//	public void editEnquiryReject(@PathVariable ("id") int id, @RequestBody EnquiryDetails enqury)
//	{
//		enqury.setCid(id);
//		enqury.getCibil().setRemark("REJECT");
//		EnquiryDetails enquiryDetails=edi.editEnquiry(enqury);	 
//	}
}

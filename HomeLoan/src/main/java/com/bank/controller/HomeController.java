package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.EnquiryDetails;
import com.bank.serviceI.EnquiryService;

@RestController
public class HomeController 
{
	
	@Autowired
	EnquiryService es;
	
	
	@RequestMapping("/")
	public String testing()
	{
		return "hi";
	}
	
	@PostMapping("/enquiry")
	public EnquiryDetails saveEnquiryDetails(@RequestBody EnquiryDetails enqury)
	{
		EnquiryDetails eq= es.saveEnquiryDetails(enqury);
		return eq;
	}
	
	
	@GetMapping("/enquiry1")
	public List <EnquiryDetails> getAllEnquiryDetails()
	{
		List<EnquiryDetails> enquirys=es.getAllEnquiryDetails();
		return enquirys;
	}
	
	
	

}

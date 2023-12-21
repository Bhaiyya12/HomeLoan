package com.cjc.homeloan.webapp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.homeloan.webapp.main.exception.NotFoundException;
import com.cjc.homeloan.webapp.main.model.Cibil;
import com.cjc.homeloan.webapp.main.model.EnquiryDetails;
import com.cjc.homeloan.webapp.main.serviceimplementation.CibilServiceImpl;
import com.cjc.homeloan.webapp.main.serviceinterface.EnquiryDetailsServiceI;
@CrossOrigin("*")
@RequestMapping(value="/cibil")
@RestController
public class CibilController {
	
	@Autowired
	CibilServiceImpl csi;
	
	@Autowired
	EnquiryDetailsServiceI edi;
	
	
	@GetMapping("/genCibil/{enquiryid}")
	public EnquiryDetails getCibil(@PathVariable  int enquiryid)
	{
		System.out.println("kkk"+enquiryid);
		
		EnquiryDetails eq=edi.Cibilgenrate(enquiryid);
		return eq;
	}
}

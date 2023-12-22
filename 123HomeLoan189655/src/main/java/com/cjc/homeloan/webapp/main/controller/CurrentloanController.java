package com.cjc.homeloan.webapp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.homeloan.webapp.main.model.CurrentLoanDetails;
import com.cjc.homeloan.webapp.main.serviceinterface.CurrentloanServiceI;

@RestController
public class CurrentloanController {
	
	@Autowired
	CurrentloanServiceI csi;
	
	@PostMapping("/loanapp")
	public ResponseEntity createLoanApp(@RequestBody CurrentLoanDetails cur)
	{
		csi.saveLoan(cur);
		return new ResponseEntity(HttpStatus.CREATED);
	}
	

}

package com.cjc.homeloan.webapp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.homeloan.webapp.main.model.CurrentLoanDetails;
import com.cjc.homeloan.webapp.main.serviceinterface.CurrentLoanDetailsInterface;


@CrossOrigin("*")
@RequestMapping(value="/currentloandetailscontroller")
@RestController
public class CurrentLoanDetailsController {
	
	
	@Autowired
	CurrentLoanDetailsInterface cls;
	
	//http://localhost:9595/currentloandetailscontroller/currentLoanDetails
	
	@PostMapping("/currentLoanDetails")
	public CurrentLoanDetails saveCurrentLoanDetailsData(@RequestBody CurrentLoanDetails cld ) {
		
		
		CurrentLoanDetails cu	=cls.saveCurrentLoanDetailsData(cld);
		return cu;
	}
	
	//http://localhost:9595/currentloandetailscontroller/currentLoanDetails
	
	@GetMapping("/currentLoanDetails")
	public  Iterable<CurrentLoanDetails> getAllCurrentLoanDetailsData(){
		
	Iterable<CurrentLoanDetails>cldlist=cls.getAllCurrentLoanDetailsData();
	
	return cldlist;
		
	}
	
	//http://localhost:9595/currentloandetailscontroller/currentLoanDetails/18
	
	
	@PutMapping("/currentLoanDetails/{loanId}")
	public String updateCurrentLoanDetailsData(@PathVariable("loanId") Integer loanId, @RequestBody CurrentLoanDetails c ) {
		
		 cls.updateData(c,loanId);
		
		return "update successfully";
	}
	
	//http://localhost:9595/currentloandetailscontroller/currentLoanDetails/20
	
	
	@GetMapping("/currentLoanDetails/{loanId}")
	public CurrentLoanDetails getSinglecurrentLoanDetailsData(@PathVariable Integer loanId) {
		
		
		 CurrentLoanDetails loanSingle	=cls.getSinglecurrentLoanDetailsData(loanId);
		return loanSingle;
	}
	
	
	
	//http://localhost:9595/currentloandetailscontroller/currentLoanDetails/20
	
	@DeleteMapping("/currentLoanDetails/{loanId}")
	public String deleteCurrentLoanDetailsData(@PathVariable Integer loanId) {
		
		cls.deleteCurrentLoanDetailsData(loanId);
		return "Delete Succefully...!!";
		
	}

}

package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.AccountDetails;
import com.bank.serviceI.AccountDetailsServiceI;


@RestController
public class AccountDetailsController {
	
	@Autowired
	AccountDetailsServiceI adi;
	
	@PostMapping("/accountdetails")
	public AccountDetails SaveAccountDetails(@RequestBody AccountDetails ad)
	{
		AccountDetails a=adi.SaveAccountDetails(ad);
		return a;
	}
	
	@GetMapping("/accountdetails")
	public Iterable<AccountDetails>getAllAccountDetails()
	{
		Iterable<AccountDetails>a1=adi.getAllAccountDetails();
		return a1;
	}
	
	@DeleteMapping("/accountdetails/{accountId}")
	public String deleteAccountDetails(@PathVariable Integer accountId)
	{
 		adi.deleteAccountDetails(accountId);
		return "your Account is deleted";
	}
	
	@GetMapping("/accountdetails/{accountId}")
	public AccountDetails getSingleAccountDetails (@PathVariable Integer accountId)
	{
		AccountDetails aa=adi.getSingleAccountDetails(accountId);
		return aa;
	}
	
	@PutMapping("/accountdetails/{accountId}")
	public AccountDetails updateAccountDetails (@PathVariable Integer accountId,@RequestBody AccountDetails a)
	{
		AccountDetails ua=adi.updateAccountDetails(accountId,a);
		return ua;
	}
	

}

 package com.cjc.homeloan.webapp.main.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.cjc.homeloan.webapp.main.model.AccountDetails;
import com.cjc.homeloan.webapp.main.repository.AccountDetailsRepository;
import com.cjc.homeloan.webapp.main.serviceinterface.AccountDetailsServiceI;

@Service
public class AccountDetailsServiceImpl implements AccountDetailsServiceI
{

	@Autowired
	AccountDetailsRepository adr;
	
	@Override
	public AccountDetails SaveAccountDetails(AccountDetails ad) 
	{
		AccountDetails a=adr.save(ad);
		return a;
	}
	@Override
	public Iterable<AccountDetails> getAllAccountDetails()
	{
		Iterable<AccountDetails> a1=adr.findAll();
		return a1;
	}
	@Override
	public void deleteAccountDetails(Integer accountId) 
	{
		adr.deleteById(accountId);
		
	}
	@Override
	public AccountDetails getSingleAccountDetails(Integer accountId) 
	{
		
		return adr.findById(accountId).get();
	}
	@Override
	public AccountDetails updateAccountDetails(Integer accountId, AccountDetails a) 
	{
		a.setAccountId(accountId);
		AccountDetails a1=adr.save(a);
		return a1;
	}

	
}

package com.bank.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.model.AccountDetails;
import com.bank.repo.AccountDetailsRepo;
import com.bank.serviceI.AccountDetailsServiceI;


@Service
public class AccountDetailsServiceImpl implements  AccountDetailsServiceI {

	@Autowired
	AccountDetailsRepo adr;
	
	
	
	@Override
	public AccountDetails SaveAccountDetails(AccountDetails ad) {
			AccountDetails a = adr.save(ad);
		return a;
	}

	@Override
	public Iterable<AccountDetails> getAllAccountDetails() {
		Iterable<AccountDetails> a1=adr.findAll();
		return a1;
	}

	@Override
	public void deleteAccountDetails(Integer accountId) {
		adr.deleteById(accountId);
		
	}

	@Override
	public AccountDetails getSingleAccountDetails(Integer accountId) {
		
		return  adr.findById(accountId).get();
	}

	@Override
	public AccountDetails updateAccountDetails(Integer accountId, AccountDetails a) {
		a.setAccountId(accountId);
		AccountDetails a1=adr.save(a);
		return a1;
	}

}

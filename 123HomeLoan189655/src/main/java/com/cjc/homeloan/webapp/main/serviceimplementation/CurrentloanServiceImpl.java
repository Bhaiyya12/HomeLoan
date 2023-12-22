package com.cjc.homeloan.webapp.main.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.homeloan.webapp.main.model.CurrentLoanDetails;
import com.cjc.homeloan.webapp.main.repository.CurrentLoanDetailsRepository;
import com.cjc.homeloan.webapp.main.serviceinterface.CurrentloanServiceI;


@Service
public class CurrentloanServiceImpl implements CurrentloanServiceI {

	
	@Autowired
	CurrentLoanDetailsRepository cu;
	@Override
	public void saveLoan(CurrentLoanDetails cur) {
		
		cu.save(cur);
	
	}

}

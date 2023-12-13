package com.cjc.homeloan.webapp.main.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.cjc.homeloan.webapp.main.model.CurrentLoanDetails;
import com.cjc.homeloan.webapp.main.repository.CurrentLoanDetailsRepository;
import com.cjc.homeloan.webapp.main.serviceinterface.CurrentLoanDetailsInterface;

@Service
public class CurrentLoanDetailsServiceImpl implements CurrentLoanDetailsInterface {
	
	@Autowired
	CurrentLoanDetailsRepository cldr;

	@Override
	public CurrentLoanDetails saveCurrentLoanDetailsData(CurrentLoanDetails cld) {
		CurrentLoanDetails cur	=cldr.save(cld);
		return cur;
	}

	@Override
	public Iterable<CurrentLoanDetails> getAllCurrentLoanDetailsData() {
		
	Iterable<CurrentLoanDetails> list=cldr.findAll();
	
		return list;
	}
	@Override
	public CurrentLoanDetails getSinglecurrentLoanDetailsData(Integer loanId) {
		CurrentLoanDetails singleData	=cldr.findById(loanId).get();
		return  singleData;
	}

	@Override
	public String deleteCurrentLoanDetailsData(Integer loanId) {
		cldr.deleteById(loanId);
		return "Successfully Deleted...";
		
	}

	@Override
	public CurrentLoanDetails updateData(CurrentLoanDetails c, Integer loanId) {
		      c.setCurrentloanId(loanId);
		return cldr.save(c);
	}

	
	
	

	

	}

package com.cjc.homeloan.webapp.main.serviceinterface;

import com.cjc.homeloan.webapp.main.model.CurrentLoanDetails;

public interface CurrentLoanDetailsInterface {
	
	public CurrentLoanDetails saveCurrentLoanDetailsData(CurrentLoanDetails cld);
	
	public Iterable<CurrentLoanDetails> getAllCurrentLoanDetailsData();
	
	
	
	public CurrentLoanDetails getSinglecurrentLoanDetailsData(Integer loanId);
	
	public String deleteCurrentLoanDetailsData(Integer loanId);

	public CurrentLoanDetails updateData(CurrentLoanDetails c, Integer loanId);

}

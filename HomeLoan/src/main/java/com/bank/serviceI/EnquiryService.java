package com.bank.serviceI;

import java.util.List;

import com.bank.model.EnquiryDetails;

public interface EnquiryService 
{
	public EnquiryDetails saveEnquiryDetails(EnquiryDetails enqury);
	public List<EnquiryDetails> getAllEnquiryDetails();

}

package com.cjc.homeloan.webapp.main.serviceinterface;



import java.util.List;

import com.cjc.homeloan.webapp.main.model.Cibil;
import com.cjc.homeloan.webapp.main.model.EnquiryDetails;


public interface EnquiryDetailsServiceI {

	public EnquiryDetails saveEnquiryDetails(EnquiryDetails enqury);


	public List<EnquiryDetails> getAllEnquiryDetails();


	public EnquiryDetails getSingleEnquiryDetails(int id);


	public void deleteEnquiry(int id);


	public EnquiryDetails editEnquiry(EnquiryDetails enqury);
	
	
	public EnquiryDetails Cibilgenrate(int enquryid);
	
}


package com.cjc.homeloan.webapp.main.serviceimplementation;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cjc.homeloan.webapp.main.model.EnquiryDetails;
import com.cjc.homeloan.webapp.main.repository.EnquiryDetailsRepository;
import com.cjc.homeloan.webapp.main.serviceinterface.EnquiryDetailsServiceI;

@Service
public class EnquiryDetailsServiceImpl implements EnquiryDetailsServiceI {

	@Autowired
	EnquiryDetailsRepository edr;

	@Override
	public EnquiryDetails saveEnquiryDetails(EnquiryDetails enqury)
	{
		
		return edr.save(enqury);
	}

	@Override
	public EnquiryDetails getSingleEnquiryDetails(int id)
	{
	   Optional<EnquiryDetails> e1=edr.findById(id);
		return e1.get();
	}

	@Override
	public List<EnquiryDetails> getAllEnquiryDetails()
	{
		
		return edr.findAll();
	}

	@Override
	public void deleteEnquiry(int id) 
	{
	    edr.deleteById(id);
		 
	}

	@Override
	public EnquiryDetails editEnquiry(EnquiryDetails enquiry) {
		return edr.save(enquiry);
	}


}

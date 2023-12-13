package com.bank.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.model.EnquiryDetails;
import com.bank.repo.EnquiryRepo;
import com.bank.serviceI.EnquiryService;

@Service
public class EnquiryServiceImpl implements EnquiryService
{
	
	@Autowired
private	EnquiryRepo er;

	@Override
	public EnquiryDetails saveEnquiryDetails(EnquiryDetails enqury) {
		
		
		return er.save(enqury);
	}
	
	
	@Override
	public List<EnquiryDetails> getAllEnquiryDetails()
	{
		
		return er.findAll();
	}	
	
	

}

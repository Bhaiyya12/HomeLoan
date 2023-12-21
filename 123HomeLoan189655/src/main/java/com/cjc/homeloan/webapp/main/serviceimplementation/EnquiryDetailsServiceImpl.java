package com.cjc.homeloan.webapp.main.serviceimplementation;



import java.text.SimpleDateFormat;
import java.util.Date;
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

	@Override
	public EnquiryDetails Cibilgenrate(int enquiryid) {
		

		

		
		Optional<EnquiryDetails> opt = edr.findById(enquiryid);
		
	
		
		EnquiryDetails enquiryDetails = opt.get();
		
		//CIbil Score
		int min=300;
		int max=900;
		int a	=(int) (Math.random()*(max-min+1)+min);
		
		enquiryDetails.setCibilScore(a);
		// Set Date
		System.out.println("imp3"+enquiryDetails.getFirstName());
		
		if(a>650)
		{
			enquiryDetails.setCibilStatus("Approved");
			if(a>=800)
			{
				enquiryDetails.setRemark("very good");
			}
			else if(a<=700)
			{
				enquiryDetails.setRemark("Satisfactory");
			}
			
			
			
			
		}
		else
		{
			enquiryDetails.setCibilStatus("Rejeted");
		}
		
		
		
		EnquiryDetails save = edr.save(enquiryDetails);
		System.out.println("imp4");
		
		
		System.out.println(a);
		
		return save;
		
		
	
	
		
	}
	}

	
	
	
	




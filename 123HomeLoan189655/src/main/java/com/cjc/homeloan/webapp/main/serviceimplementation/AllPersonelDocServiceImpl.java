package com.cjc.homeloan.webapp.main.serviceimplementation;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.homeloan.webapp.main.model.AllPersonelDoc;
import com.cjc.homeloan.webapp.main.model.EnquiryDetails;
import com.cjc.homeloan.webapp.main.repository.AllPersonalDocumentsRepository;
import com.cjc.homeloan.webapp.main.repository.EnquiryDetailsRepository;
import com.cjc.homeloan.webapp.main.serviceinterface.AllPersonelDocServiceI;
import com.cjc.homeloan.webapp.main.serviceinterface.EnquiryDetailsServiceI;

@Service
public class AllPersonelDocServiceImpl implements AllPersonelDocServiceI {

	
	@Autowired
	public  AllPersonalDocumentsRepository aphr;

	@Override
	public List<AllPersonelDoc> savedoc(AllPersonelDoc d) 
	{
		System.out.println("service data:-"+d);
		aphr.save(d);
		List<AllPersonelDoc> l1=aphr.findAll();
		return l1;
	}

	@Override
	public List<AllPersonelDoc> getDoc() 
	{
		List<AllPersonelDoc> l1=aphr.findAll();
		return l1;
	}

	@Override
	public List<AllPersonelDoc> getAlld() {
		List<AllPersonelDoc> doc=aphr.findAll();
		return doc;
	}

	@Override
	public List<AllPersonelDoc> update(AllPersonelDoc ld) {
		AllPersonelDoc id=aphr.findByCustomerid(ld.getCustomerid());
//		AllPersonelDoc id=aphr.findByDid(ld.getDid());
		id.setStatus(ld.getStatus());
		aphr.save(id);
		List<AllPersonelDoc>update=aphr.findAll();
		return update;
	}
}

		
	
	

	
	
	
	




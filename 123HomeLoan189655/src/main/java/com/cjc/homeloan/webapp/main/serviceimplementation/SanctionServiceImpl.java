package com.cjc.homeloan.webapp.main.serviceimplementation;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.homeloan.webapp.main.model.CurrentLoanDetails;
import com.cjc.homeloan.webapp.main.model.SanctionLetter;
import com.cjc.homeloan.webapp.main.repository.CurrentLoanDetailsRepository;
import com.cjc.homeloan.webapp.main.serviceinterface.SanctionService;
import com.cjc.homeloan.webapp.main.utility.PDF_Generator;
import com.lowagie.text.Document;

import jakarta.websocket.server.ServerEndpoint;


@Service
public class SanctionServiceImpl implements SanctionService {
	
	
	@Autowired
	CurrentLoanDetailsRepository cur;
	
	@Override
	public ByteArrayInputStream createSanctionPdf(int id) {
		
		Document doc=new Document();
		ByteArrayOutputStream output=new ByteArrayOutputStream();
		
Optional<CurrentLoanDetails> oplon= cur.findById(id);	

CurrentLoanDetails cou=oplon.get();
	
	if(oplon.get().getSanctionletter()!=null)
	{
		ByteArrayInputStream result=PDF_Generator.genrateSanctionLatter(doc, output,cou);
		return result;
	}
	else {
		return null;
	}
		
	}
	

}



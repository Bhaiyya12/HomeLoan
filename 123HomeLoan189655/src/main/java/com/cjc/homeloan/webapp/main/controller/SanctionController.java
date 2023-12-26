package com.cjc.homeloan.webapp.main.controller;

import java.io.ByteArrayInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cjc.homeloan.webapp.main.serviceinterface.SanctionService;

public class SanctionController {
	
	@Autowired private SanctionService sanctionService;
	
	@GetMapping("/sanctionpdf/{loanId}")
	public ResponseEntity<InputStreamResource> exposeSanction_pdf(@PathVariable int loanId)
	{
	   ByteArrayInputStream byteArrayInputPDf=	sanctionService.createSanctionPdf(loanId);
	   
	   HttpHeaders headers=new HttpHeaders();  
	   
	   
	   // due to attachment :- this file getting download
	   //filename=sanction.pdf :- render on the same browser
//	   headers.add("Content-Disposition", "attachment;filename=sanction.pdf");
	   
	   
	   
	   //inline: only rendering page not download
	   headers.add("Content-Disposition", "inline;filename=sanction.pdf");
	   
	   return ResponseEntity.ok()
			                .headers(headers)
			                .contentType(MediaType.APPLICATION_PDF)
			                .body(new InputStreamResource(byteArrayInputPDf));
	}

}

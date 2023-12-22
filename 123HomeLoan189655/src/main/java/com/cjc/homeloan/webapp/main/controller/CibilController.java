

package com.cjc.homeloan.webapp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.homeloan.webapp.main.exception.NotFoundException;
import com.cjc.homeloan.webapp.main.model.Cibil;
import com.cjc.homeloan.webapp.main.model.EnquiryDetails;
import com.cjc.homeloan.webapp.main.serviceimplementation.CibilServiceImpl;
import com.cjc.homeloan.webapp.main.serviceinterface.EnquiryDetailsServiceI;
@CrossOrigin("*")
@RequestMapping(value="/cibil")
@RestController
public class CibilController {
	
	@Autowired
	CibilServiceImpl csi;
	
	@Autowired
	EnquiryDetailsServiceI edi;
	
	
	
	//http://localhost:9595/cibil/cibildata/1
	
	
	@PostMapping("/cibildata/{cid}")
	public ResponseEntity<Cibil> saveCibilData(@RequestBody Cibil c, @PathVariable("cid") int cid)
	{
		System.out.println("CIBIL ID = "+cid);
		EnquiryDetails edaiDetails=edi.getSingleEnquiryDetails(cid);
		
		if(edaiDetails!=null)
		{
			c.setCibilId(edaiDetails.getCid());
			Cibil cibil=csi.saveData(c);
			return new ResponseEntity<Cibil>(cibil,HttpStatus.CREATED);
		}
		else {
				throw new NotFoundException("Cibil Detail Not Found");
		}
	}
	
	//http://localhost:9595/api/getCibilData
	
	
	@GetMapping("/cibildata")
	public ResponseEntity<Iterable<Cibil>> getAllCibilData(){
		Iterable<Cibil> c =csi.getAllCibilData();
		return new ResponseEntity<Iterable<Cibil>>(c,HttpStatus.OK);
	}
	
	//http://localhost:9595/api/getSingleCibilData/8
	
	@GetMapping("/cibildata/{cibilId}")
	public ResponseEntity<Cibil> getSingleData(@PathVariable Integer cibilId) {
		Cibil c=csi.getSingleData(cibilId);
		if(c!=null)
		{
			return new ResponseEntity<Cibil>(c,HttpStatus.OK);
		}
		else {
			throw new NotFoundException("Cibil Detail not Found");
		}
		
	}
}

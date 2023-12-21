package com.cjc.homeloan.webapp.main.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.homeloan.webapp.main.model.AllPersonelDoc;
import com.cjc.homeloan.webapp.main.model.LocalAddress;
import com.cjc.homeloan.webapp.main.serviceinterface.AllPersonelDocServiceI;
import com.cjc.homeloan.webapp.main.serviceinterface.LocalAddressServiceI;
import com.google.gson.Gson;


@CrossOrigin("*")

@RestController
public class AllDocController 
{
	@Autowired
	public AllPersonelDocServiceI aphs;


	@RequestMapping(value = "/savedoc",method = RequestMethod.POST,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public List<AllPersonelDoc > m1(@RequestPart(required = true, value = "addressproof") MultipartFile files1,
			@RequestPart(required = true, value = "pancard") MultipartFile files2,
			@RequestPart(required = true, value = "itr") MultipartFile files3,
			@RequestPart(required = true, value = "addharcard") MultipartFile files4,
			@RequestPart(required = true, value = "photo") MultipartFile files5,
			@RequestPart(required = true, value = "signature") MultipartFile files6,
			@RequestPart("doc") String doc
			) throws IOException{		
		System.out.println("inside method");
		
		AllPersonelDoc d=new AllPersonelDoc();
		d.setAddressproof(files1.getBytes());
		d.setPancard(files2.getBytes());
		d.setItr(files3.getBytes());
		d.setAddharcard(files4.getBytes());
		d.setPhoto(files5.getBytes());
		d.setSignature(files6.getBytes());		
		
		Gson gson=new Gson();
		AllPersonelDoc d1=gson.fromJson(doc,AllPersonelDoc.class);
		d.setStatus(d1.getStatus());
		List<AllPersonelDoc> list=aphs.savedoc(d);
		return list;
	}
	@GetMapping("/files")
	public List<AllPersonelDoc> getFiles()
	{
		return aphs.getDoc();
	}

	@GetMapping("/AllDoc")
	public List<AllPersonelDoc> getAlldoc()
	{
		return aphs.getAlld();
	}
	@RequestMapping(value = "/updateSaveData",method = RequestMethod.PATCH)
	public List<AllPersonelDoc> update
	(
			@RequestPart("doc")String doc)throws IOException
	{
	System.out.println(doc);	
	AllPersonelDoc ld=new AllPersonelDoc();
		Gson gson=new Gson();
		AllPersonelDoc d1=gson.fromJson(doc,AllPersonelDoc.class);
//		ld.setCustomerid(d1.getCustomerid());
		ld.setStatus(d1.getStatus());
	System.out.println(ld);
	
		List<AllPersonelDoc>list=aphs.update(ld);
		return list;		
}	
}
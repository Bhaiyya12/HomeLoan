package com.cjc.homeloan.webapp.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.homeloan.webapp.main.model.Administrator;
import com.cjc.homeloan.webapp.main.serviceinterface.AdministratorService;

@CrossOrigin("*")
@RestController
public class AddminstratorController {

	@Autowired private AdministratorService administratorService;
	
	@PostMapping("/user")
	public ResponseEntity createuser(@RequestPart("json") String user_json,
			@RequestPart("profile") MultipartFile userProfile)
	{
		administratorService.saveUser(user_json, userProfile);
		return new ResponseEntity(HttpStatus.CREATED);
				
				
	}
	@GetMapping("/login/{username}/{password}")
	public ResponseEntity<Administrator> onLogin(@PathVariable String username,@PathVariable String password)
	{
		Administrator user = administratorService.login(username,password);
		return new ResponseEntity<Administrator>(user,HttpStatus.OK);
	}
	
	@GetMapping("/getUserData")
	public Iterable<Administrator> getData()
	{
		Iterable<Administrator>ad= administratorService.getAllData();
		return ad;
	}
	
	
	
}














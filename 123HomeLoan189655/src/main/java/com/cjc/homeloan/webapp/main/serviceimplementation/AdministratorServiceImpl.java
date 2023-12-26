package com.cjc.homeloan.webapp.main.serviceimplementation;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.homeloan.webapp.main.model.Administrator;
import com.cjc.homeloan.webapp.main.repository.AddministratorRepository;
import com.cjc.homeloan.webapp.main.serviceinterface.AdministratorService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class AdministratorServiceImpl implements AdministratorService{

	@Autowired private AddministratorRepository ar;
	@Override
	public void saveUser(String user_json,MultipartFile userProfile) 
	{
		ObjectMapper mapper=new ObjectMapper();
		Administrator administrator;
		try {
			administrator = mapper.readValue(user_json, Administrator.class);
			administrator.setProfilephoto(userProfile.getBytes());

			ar.save(administrator);
				
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public Administrator login(String username, String password) {
	  Optional<Administrator>	user=ar.findByUserNameAndPassWord(username,password);
	  if(user.isPresent())
	  {
	  return user.get();
	  }
	  else {
		  return null;
		  // throw new InvalidLoginCredentials();
	  }
	}
	@Override
	public Iterable<Administrator> getAllData() {
		
		Iterable<Administrator> ad=ar.findAll();
		return ad;
		
	}
	@Override
	public void deleteSingleData(int userId) {
	ar.deleteById(userId);
		
	}

}

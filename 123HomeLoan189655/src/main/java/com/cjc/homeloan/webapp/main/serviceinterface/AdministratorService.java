package com.cjc.homeloan.webapp.main.serviceinterface;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.homeloan.webapp.main.model.Administrator;

public interface AdministratorService {


public void saveUser(String user_json, MultipartFile userProfile);

public Administrator login(String username, String password);

public Iterable<Administrator> getAllData();

}

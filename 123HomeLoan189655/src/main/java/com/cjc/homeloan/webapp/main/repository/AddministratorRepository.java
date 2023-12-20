package com.cjc.homeloan.webapp.main.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cjc.homeloan.webapp.main.model.Administrator;

public interface AddministratorRepository extends CrudRepository<Administrator, Integer>{

 public	Optional<Administrator> findByUserNameAndPassWord(String username, String password);

	
}

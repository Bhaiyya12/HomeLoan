package com.cjc.homeloan.webapp.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class AccountDetails 
{
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
private	 int accountid;
	 private	String accountype;
	 private	String accountHolderName;
	 private	String accountStatus;
	 private	String accountNO;
	 private		String IFSC_Code;
	 

}
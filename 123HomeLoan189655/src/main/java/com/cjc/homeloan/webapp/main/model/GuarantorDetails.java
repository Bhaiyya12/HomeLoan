package com.cjc.homeloan.webapp.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class GuarantorDetails 
{
	
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
    private	int gid;
	private	String gname; 
	private	String gdateofBirth;
	private	String grelationshipwithCustomer;
	private	String gmobNo;
	private	String gadharCardNo;
	private	String gjobDetails;
	private	String gloaclAddress;
	private	String gpermanentAddress;
}

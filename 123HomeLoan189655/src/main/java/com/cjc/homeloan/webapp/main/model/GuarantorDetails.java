package com.cjc.homeloan.webapp.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class GuarantorDetails {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
    private	int gid;
	private		String gName; 
	private		String gDateofBirth;
	private		String gRelationshipwithCustomer;
	private		String gMobNo;
	private		String gAdharCardNo;
	private		String gJobDetails;
	private		String gloaclAddress;
	private		String gPermanentAddress;
}

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
	private int GuarantorId;
	private String GuarantorName;
	private String GaurantorDateOfBirth;
	private String GuarantorRelationshipWithCustomer;
	private long GuarantorMobileNumber;
	private long GuarantorAadharCardNo;
	private String GuarantorMortgageDetails;
	private String GuarantorJobDetails;
	private String GuarantorLocalAddress;
	private String GuarantorPermanentAddress;

}

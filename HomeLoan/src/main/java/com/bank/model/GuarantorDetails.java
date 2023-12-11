package com.bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class GuarantorDetails {
	
	@Id
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

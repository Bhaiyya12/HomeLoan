package com.cjc.homeloan.webapp.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class MortgageDetails {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int mortageId;
	private double mortagePropertyValue;
	private byte[] mortagePropertyProof;
	private String mortagePropertyType;
	private double mortageLoanOnProperty;
	private byte[] mortagePropertyInsurance;

}

package com.bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class MortgageDetails {
	@Id
	private int mortageId;
	private double mortagePropertyValue;
	private byte[] mortagePropertyProof;
	private String mortagePropertyType;
	private double mortageLoanOnProperty;
	private byte[] mortagePropertyInsurance;

}

package com.cjc.homeloan.webapp.main.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
@Data
@Entity
public class CurrentLoanDetails 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loanId;
	private String customerName;
	private String customerEmail;
	private int cibilScore;
	private double customerTotalLoanRequired;
	private int tenure;
	private double rateOfInterest;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private SanctionLetter sanctionletter;
	 
}

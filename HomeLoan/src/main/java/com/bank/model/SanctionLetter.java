package com.bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class SanctionLetter {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int sanctionId;
	private String sanctionDate;
	private String applicantName;
	private double contactDetails;
	private String producthomeEquity;
	private double loanAmtSanctioned;
	private String interestType;
	private int rateOfInterest;
	private int loanTenure;
	private double monthlyEmiAmount;
	private String modeOfPayment;
	private String remarks;
	private String termsCondition;
	private String status;
}

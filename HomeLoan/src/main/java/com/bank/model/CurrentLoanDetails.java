package com.bank.model;

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
	private int currentloanId;
	private int currentloanNo;
	@OneToOne(cascade = CascadeType.ALL)
	private EMIDetails Emidetails;  // one to one 
	private double loanAmount;
	private int rateOfInterest;
	private int tenure ;
	private double totalAmountToBePaid;
	private int processingFees;
	private double totalInterest;
	private String sanctionDate;
	private String remark;
	private String status;
	

}

package com.bank.model;

import jakarta.persistence.Entity;
import lombok.Data;
@Data
@Entity
public class CurrentLoanDetails 
{
	private int currentloanId;
	private int currentloanNo;
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

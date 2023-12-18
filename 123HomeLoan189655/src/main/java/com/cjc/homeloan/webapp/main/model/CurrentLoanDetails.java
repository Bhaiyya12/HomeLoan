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
	private int currentloanId;
	private int currentloanNo;
	private double loanAmount;
	private double rateOfInterest;
	private int tenure ;
	private double totalAmountToBePaid;
	private double processingFees;
	private double totalInterest;
	private String sanctionDate;
	private String remark;
	private String status;
	@OneToOne(cascade = CascadeType.MERGE.DETACH.REFRESH.REMOVE)
	private EMIDetails Emidetails;  
}

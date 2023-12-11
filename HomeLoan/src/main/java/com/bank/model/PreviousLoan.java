package com.bank.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class PreviousLoan 
{
	private int previousLoanId;
	private double previousLoanAmount;
	private int previousLoanTenure;
	private double previousLoanpaidAmount;
	private double previousLoanremainingAmount;
	private int previousLoandefaulterCount;
	private PreviousLoanBank previousLoanbankDetails;   //one to one
	private String previousLoanStatus;
	private String previousLoanRemark;
	

}

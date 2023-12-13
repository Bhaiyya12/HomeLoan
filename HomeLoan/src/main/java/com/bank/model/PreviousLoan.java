package com.bank.model;


import org.hibernate.annotations.Cascade;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class PreviousLoan 
{
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
	private int previousLoanId;
	private double previousLoanAmount;
	private int previousLoanTenure;
	private double previousLoanpaidAmount;
	private double previousLoanremainingAmount;
	private int previousLoandefaulterCount;
	@OneToOne(cascade = CascadeType.ALL)
	
	private PreviousLoanBank previousLoanbankDetails;   
	private String previousLoanStatus;
	private String previousLoanRemark;



}
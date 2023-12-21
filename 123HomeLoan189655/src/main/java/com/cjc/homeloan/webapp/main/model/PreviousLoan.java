package com.cjc.homeloan.webapp.main.model;


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
 private int ploanId;
 private	double ploanAmount;
 private	int pTenure;
 private	double paidAmount;
 private	double remainingAmount;
 private	String previousbankIFSC;
 private	String status;
 private	String remark;
	



}
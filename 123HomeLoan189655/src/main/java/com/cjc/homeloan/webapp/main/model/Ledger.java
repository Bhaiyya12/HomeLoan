package com.cjc.homeloan.webapp.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Ledger {
   
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
		public int ledgerId;
		public String ledgerCreatedDate;
		public double totalLoanAmount;
		public double payableAmountwithInterest;
		public int tenure;
		public double monthlyEMI;
		public double amountPaidtillDate;
		public double remainingAmount;
		public String nextEmiDatestart;
		public String nextEmiDateEnd;
		public int defaulterCount;
		public String previousEmitStatus;
		public String currentMonthEmiStatus;
		public String loanEndDate;
		public String loanStatus;

}

package com.cjc.homeloan.webapp.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class LoanDisbursement {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int AgreementId;
	private int LoanNo;
	private String AgreementDate;
	private String AmountPayType;
	private double TotalAmount;
	private String BankName;
	private long AccountNumber;
	private String IFSCCode;
	private String AccountType;
	private double TransferAmount;
	private String PaymentStatus;
	private String AmountPaidDate;

}

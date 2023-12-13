package com.cjc.homeloan.webapp.main.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Data;


@Data
@Entity
public class PreviousLoanBank {
  @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int branchId;
	private String branchName;
	private double branchCode;
	private String branchType;
	private String IFSC_code;
	private String MICR_code;
	private double ConatctNumber;
	//private BankAddress BankAddress;
	private String Email;
	private String status;

}

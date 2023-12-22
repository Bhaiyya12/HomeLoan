package com.cjc.homeloan.webapp.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SanctionLetter {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int sanctionId;
	
	private float loanRequired;
	private float interestRate;
	private int sanTenure;
	private double monthlyEmi;
	private double payableAmmount;
	
	
	@Lob
	private byte[] sanctionPdf;

}

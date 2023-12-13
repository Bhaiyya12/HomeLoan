package com.cjc.homeloan.webapp.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class EMIDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int emiId;
	private double emiAmountMonthly;
	private String nextEmiDueDate;
	private String previousEmiStatus;

}
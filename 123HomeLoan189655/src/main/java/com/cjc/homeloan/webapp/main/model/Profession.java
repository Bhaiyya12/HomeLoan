package com.cjc.homeloan.webapp.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Profession {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int professionId;
	private String professionType;
	private double professionSalary;
	private String professionSalaryType;
	private String professionWorkingPeriod;
	private String professionDesignation;
	private byte[] professionSalarySlips;


}

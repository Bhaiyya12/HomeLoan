package com.bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Profession {
	@Id
	private int professionId;
	private String professionType;
	private double professionSalary;
	private String professionSalaryType;
	private String professionWorkingPeriod;
	private String professionDesignation;
	private byte[] professionSalarySlips;


}

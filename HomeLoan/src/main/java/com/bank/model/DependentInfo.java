package com.bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class DependentInfo {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int  dependentinfold;
	private String  fatherName;
	private String motherName;
	private String spouseName;
	private int  noOfFamilyMember;
	private int  noOfChild;
	private String maritalStatus;
	private String dependentMember;

}

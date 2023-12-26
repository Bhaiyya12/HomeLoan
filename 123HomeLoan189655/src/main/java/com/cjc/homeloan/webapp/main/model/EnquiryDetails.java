package com.cjc.homeloan.webapp.main.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity 
public class EnquiryDetails {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String firstName;
	private String lastName;
	private int age;
	private String email;
	private Double mobileNo;
	private Double pancardNo;
	private int cibilScore;
	private String cibilStatus;
	private String remark;
	


}
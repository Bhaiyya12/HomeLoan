package com.bank.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
@Data
@Entity
public class Cibil {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int cID;
	private String firstName;
	private String lastName;
	private int age;
	private String email;
	private Double mobileNo;
	private Double pancardNo;
	@OneToOne(cascade = CascadeType.ALL)
	private Cibil cibilScore;


}

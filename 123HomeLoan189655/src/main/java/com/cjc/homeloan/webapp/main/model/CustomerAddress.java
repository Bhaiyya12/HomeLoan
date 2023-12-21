package com.cjc.homeloan.webapp.main.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Data;

@Data
@Entity
public class CustomerAddress {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int customerAddressId;
	private	String houseno;
	private	String streetname;
	private	String areaname;
	private	String cityname;
	private	String pincode;
	private	String district;
	private	String state;

}

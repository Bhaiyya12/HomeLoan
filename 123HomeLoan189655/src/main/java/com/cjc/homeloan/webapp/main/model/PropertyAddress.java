package com.cjc.homeloan.webapp.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class PropertyAddress {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int PropertyAddressId;
	private String areaname;
	private String cityname;
	private String district;
	private String state;
	private long pincode;
	private String streetName;
}
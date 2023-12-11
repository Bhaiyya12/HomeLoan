package com.bank.model;
@Data
@Entity
public class LocalAddress {
@Id
	private int localAddressId;
	private String areaname;
	private String cityname;
	private String district;
	private String state;
	private Long pincode;
	private int houseNumber;
	private String streetName;
	

}

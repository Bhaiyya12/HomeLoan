package com.cjc.homeloan.webapp.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Data;


@Entity
@Data
public class AllPersonelDoc {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	public int did;
	
	private int customerid;
	public String status;
	@Lob
private	byte[] addressproof;
	@Lob
private	byte[] pancard;
	@Lob
private	byte[] itr;
	@Lob
private	byte[] addharcard;
	@Lob
private	byte[] photo;
	@Lob
private	byte[] signature;

	

}


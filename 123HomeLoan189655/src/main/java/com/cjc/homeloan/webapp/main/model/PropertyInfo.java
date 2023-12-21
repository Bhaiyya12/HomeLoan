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
public class PropertyInfo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

private	int propertyid;
	private	String propertytype;
	private	String propertyArea;
	private	String constructionArea;
	private	double propertyPrice;
	private	double constructionPrice;
	private	String property_Address;

}

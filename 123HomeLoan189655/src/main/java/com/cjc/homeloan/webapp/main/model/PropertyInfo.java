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
	private int propertyId;
	private String propertyType;
	private String propertyArea;
	private String constructionArea;
	private double propertyPrice;
	private double constructionPrice;
	private byte[] propertyDocument;
	private byte[] prizeProofs;
	@OneToOne(cascade=CascadeType.ALL)
	private PropertyAddress propertyAddress;

}

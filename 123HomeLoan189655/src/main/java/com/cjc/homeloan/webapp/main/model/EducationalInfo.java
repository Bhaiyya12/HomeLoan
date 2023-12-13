package com.cjc.homeloan.webapp.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class EducationalInfo {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int educationId;
	private String educationType;

}

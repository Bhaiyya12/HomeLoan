package com.cjc.homeloan.webapp.main.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Cibil {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cibilId;
	private int cibilScore;
	private String cibilScoreDateTime;
	private String status;
	private String remark;


}
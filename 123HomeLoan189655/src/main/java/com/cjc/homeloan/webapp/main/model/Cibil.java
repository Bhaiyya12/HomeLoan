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
public class Cibil {
	@Id
	
	private Integer cibilId;
	private Integer cibilScore;
	private String cibilScoreDateTime;
	private String status;
	private String remark;


}

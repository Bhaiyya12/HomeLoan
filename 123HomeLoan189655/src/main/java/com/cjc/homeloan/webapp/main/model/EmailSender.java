package com.cjc.homeloan.webapp.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailSender {
	
	
	private String fromEmailId;
	private String toEmailId;
	private String textBody;
	private String subject;
	

}

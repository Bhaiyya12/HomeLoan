package com.cjc.homeloan.webapp.main.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
	
	private int statusCode;
	private String errorMsg;
	private Date date;
	
	

}

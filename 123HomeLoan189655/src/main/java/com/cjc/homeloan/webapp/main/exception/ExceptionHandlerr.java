package com.cjc.homeloan.webapp.main.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class ExceptionHandlerr {
	
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<String> NotFoundExceptionHandler(NotFoundException p)
	{
		return new ResponseEntity<String>(p.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(ValueNotValidException.class)
	public ResponseEntity<String> ValueNotValidExceptionHandler(ValueNotValidException p)
	{
		return new ResponseEntity<String>(p.getMessage(),HttpStatus.BAD_REQUEST);
	}

}

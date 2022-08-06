package com.api.serviceGerence.exceptions;

import org.springframework.http.HttpStatus;

public class ExceptionsReturnMessage extends RuntimeException{
  
	private static final long serialVersionUID = 1L;

	public ExceptionsReturnMessage(String msg, HttpStatus httpStatus) {
		super(msg);
 	}
}

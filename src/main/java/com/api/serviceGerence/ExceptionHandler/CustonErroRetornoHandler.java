package com.api.serviceGerence.ExceptionHandler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.api.serviceGerence.exceptions.ExceptionsReturnMessage;
import com.api.serviceGerence.modelErro.modelErro;

@RestControllerAdvice
public class CustonErroRetornoHandler {

	@ExceptionHandler(ExceptionsReturnMessage.class)
	public modelErro returnErroCustom(ExceptionsReturnMessage ex, WebRequest request) {
		modelErro error = new modelErro(HttpStatus.NO_CONTENT.value(), new Date(), ex.getMessage(),
				request.getDescription(false));

		return error;
	}
}

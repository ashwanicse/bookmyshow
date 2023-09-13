package com.bookmyshow.exceptions;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.bookmyshow.model.ErrorResopnse;

@RestControllerAdvice
public class ExceptionHandlerAdvice {

	@ExceptionHandler(CustomException.class)
	public ResponseEntity<ErrorResopnse> customExceptionHandler(CustomException ex) {
		return handler(ex.getCode(), ex.getMessage());
	}
	

	private ResponseEntity<ErrorResopnse> handler(int code, String message) {
		return new ResponseEntity<ErrorResopnse>(new ErrorResopnse(code, message), HttpStatusCode.valueOf(code));
	}

}

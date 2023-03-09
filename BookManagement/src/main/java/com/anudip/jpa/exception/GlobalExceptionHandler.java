package com.anudip.jpa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(BookNotFoundException.class)
	public ResponseEntity<ErrorMessage> bookException(BookNotFoundException ex , WebRequest wr){
		ErrorMessage em = new ErrorMessage(HttpStatus.NOT_FOUND,ex.getMessage());
		return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ErrorMessage> userException
	(UserNotFoundException ex , WebRequest wr){
		ErrorMessage em = new ErrorMessage(HttpStatus.NOT_FOUND,ex.getMessage());
		return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}

}

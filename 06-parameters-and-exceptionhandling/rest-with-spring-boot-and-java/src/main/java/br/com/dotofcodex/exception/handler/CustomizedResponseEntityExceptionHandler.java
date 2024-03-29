package br.com.dotofcodex.exception.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.dotofcodex.exception.ExceptionResponse;
import br.com.dotofcodex.exception.UnsupportedMathOperationException;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptionResponse> handleAllException(Exception e, WebRequest request) {
		ExceptionResponse response = new ExceptionResponse(
			new Date(), e.getMessage(), request.getDescription(false));

		return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(UnsupportedMathOperationException.class)
	public final ResponseEntity<ExceptionResponse> handleBadRequestException(
			UnsupportedMathOperationException e, WebRequest request) {
		ExceptionResponse response = new ExceptionResponse(
			new Date(), e.getMessage(), request.getDescription(false));

		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	}
}

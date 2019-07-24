package com.cg.tms.exception;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class ProgramExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handleAllExceptions(Exception ex, WebRequest request) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
		errorResponse.setMessage(ex.getMessage());
		errorResponse.setMessageDetails(request.getDescription(false));
		return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(ProgramException.class)
	public ResponseEntity<ErrorResponse> handleProgramExceptions(ProgramException pe, WebRequest request) {
		ErrorResponse errorResponse = new ErrorResponse(pe.getMessage(), HttpStatus.BAD_REQUEST.value(),
				request.getDescription(false));
//		errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
//        errorResponse.setMessage(pe.getMessage());
//       errorResponse.setMessageDetails(request.getDescription(false));
		return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.BAD_REQUEST);

	}
}

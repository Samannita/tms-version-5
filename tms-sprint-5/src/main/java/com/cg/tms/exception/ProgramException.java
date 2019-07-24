package com.cg.tms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ProgramException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ProgramException(String errorMassage) {
		super(errorMassage);
	}

	public ProgramException(String errorMessage, HttpStatus httpStatus) {
		super(errorMessage);

	}

}

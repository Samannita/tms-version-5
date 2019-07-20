package com.cg.tms.exception;

public class ErrorResponse {
	private String message;

	private int status;
	private String messageDetails;

	
	public ErrorResponse() {

	}

	public ErrorResponse(String message, int status, String messageDetails) {
		super();
		this.message = message;

		this.status = status;
		
		this.messageDetails = messageDetails;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessageDetails() {
		return messageDetails;
	}

	public void setMessageDetails(String messageDetails) {
		this.messageDetails = messageDetails;
	}


}

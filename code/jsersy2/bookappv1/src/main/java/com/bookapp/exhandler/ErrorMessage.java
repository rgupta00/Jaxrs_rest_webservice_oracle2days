package com.bookapp.exhandler;

import java.time.LocalDateTime;

public class ErrorMessage {
	private String message;
	private int statusCode;
	private String toContact;
	private LocalDateTime timestamp;
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getToContact() {
		return toContact;
	}
	public void setToContact(String toContact) {
		this.toContact = toContact;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public ErrorMessage(String message, int statusCode, String toContact, LocalDateTime timestamp) {
		super();
		this.message = message;
		this.statusCode = statusCode;
		this.toContact = toContact;
		this.timestamp = timestamp;
	}
	public ErrorMessage() {}
	@Override
	public String toString() {
		return "ErrorMessage [message=" + message + ", statusCode=" + statusCode + ", toContact=" + toContact
				+ ", timestamp=" + timestamp + "]";
	}
	
	
	

}

package com.bookapp.controller.exhandlers;

public class ErrorMessage {
	private String message;
	private int statusCode;
	private String toContect;
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
	public String getToContect() {
		return toContect;
	}
	public void setToContect(String toContect) {
		this.toContect = toContect;
	}
	public ErrorMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ErrorMessage(String message, int statusCode, String toContect) {
		super();
		this.message = message;
		this.statusCode = statusCode;
		this.toContect = toContect;
	}
	
	

}

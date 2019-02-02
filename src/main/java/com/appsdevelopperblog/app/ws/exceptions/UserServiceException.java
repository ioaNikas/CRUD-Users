package com.appsdevelopperblog.app.ws.exceptions;

public class UserServiceException extends RuntimeException {

	private static final long serialVersionUID = 3243076841313853821L;
	
	public UserServiceException(String message) {
		super(message);
	}
}

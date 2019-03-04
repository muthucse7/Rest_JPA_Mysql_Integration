/**
 * 
 */
package com.dashboard.portal.exception;

import java.util.Date;

/**
 * @author Muthu Selvam
 *
 */
public class ExceptionResponse {

	private Date dateTime;
	private String message;
	private String errorCode;
	
	public ExceptionResponse(Date dateTime, String message, String errorCode) {
		super();
		this.dateTime = dateTime;
		this.message = message;
		this.errorCode = errorCode;
	}
	
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
	
}

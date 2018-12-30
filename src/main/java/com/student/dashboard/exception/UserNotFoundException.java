/**
 * 
 */
package com.student.dashboard.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Muthu Selvam
 *
 */

@ResponseStatus
public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public UserNotFoundException(String message) {
		super(message);
	}
	
}

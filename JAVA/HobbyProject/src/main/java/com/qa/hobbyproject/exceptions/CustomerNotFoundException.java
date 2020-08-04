package com.qa.hobbyproject.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "A customer with that id does not exist")
public class CustomerNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 42L;

}

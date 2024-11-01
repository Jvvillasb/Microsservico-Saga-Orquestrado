package br.com.microservices.orchestrated.orderservice.config.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ValidationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ValidationException(String message) {
		
		super(message);
	}
}

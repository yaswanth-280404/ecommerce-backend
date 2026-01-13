package com.example.ecommerce.exception;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(basePackages = "com.example.ecommerce")
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public Map<String, Object> handleResourceNotFound(ResourceNotFoundException re){
		
		Map<String, Object> error = new LinkedHashMap<String, Object>();
		error.put("time-stamp", LocalDateTime.now());
		error.put("status", HttpStatus.NOT_FOUND.value());
		error.put("error", "Not Found");
		error.put("Message", re.getMessage());
		return error;
		
	}
	
	@ExceptionHandler(DuplicateResourceException.class)
    public Map<String, Object> handleDuplicateResource(DuplicateResourceException ex) {

        Map<String, Object> error = new LinkedHashMap<>();
        error.put("timestamp", LocalDateTime.now());
        error.put("status", HttpStatus.CONFLICT.value());
        error.put("error", "Conflict");
        error.put("message", ex.getMessage());

        return error;
    }
	

}

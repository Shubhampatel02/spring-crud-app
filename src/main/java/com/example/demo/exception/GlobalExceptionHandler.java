package com.example.demo.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
	   @ExceptionHandler(UserNotFoundException.class)
	    public ResponseEntity<Map<String, Object>> handle(UserNotFoundException ex) 
	   {

	        Map<String, Object> body = new HashMap<>();
	        body.put("status", 404);
	        body.put("error", "Not Found");
	        body.put("message", ex.getMessage());

	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(body);
	    }
}

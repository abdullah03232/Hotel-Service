package com.learn.micro.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.learn.micro.apiresponse.APIResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFound.class)
	ResponseEntity<APIResponse> resourceNotFoundHandler(ResourceNotFound excep){
		String message = excep.getMessage();
		APIResponse response = APIResponse.builder().message(message).success(false).httpStatus(HttpStatus.NOT_FOUND).build();
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	}
}

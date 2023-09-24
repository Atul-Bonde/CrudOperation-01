package com.bikkadit.crudoperation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.bikkadit.crudoperation.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(ResourceNotFound.class)
	public ResponseEntity<ApiResponse> resourceNotFound(ResourceNotFound re){
		
		ApiResponse api=new ApiResponse();
		
		api.setMessage(re.message);
		api.setStatus(false);
		
		return new ResponseEntity<ApiResponse>(api,HttpStatus.NOT_FOUND);
	}

}

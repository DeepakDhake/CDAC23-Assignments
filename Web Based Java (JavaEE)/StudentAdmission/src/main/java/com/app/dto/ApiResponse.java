package com.app.dto;

import java.time.LocalDateTime;

import lombok.Getter;

@Getter
public class ApiResponse {
	private String message;
	private LocalDateTime timeStamp;
	
	public ApiResponse(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
		this.timeStamp = LocalDateTime.now();
	}
}

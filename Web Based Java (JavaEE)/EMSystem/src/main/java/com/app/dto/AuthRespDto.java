package com.app.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthRespDto {
	private String firstName;
	private String lastName;
	private double salary;
	private LocalDate joinDate;
}

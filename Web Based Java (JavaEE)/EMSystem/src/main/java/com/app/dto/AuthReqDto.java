package com.app.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AuthReqDto {
	@NotBlank(message = "Email Cannot be blank")
	@Email(message = "Enter in proper Format")
	private String email;
	@NotBlank
	@NotNull(message = "Enter valid password")
	private String password;
}

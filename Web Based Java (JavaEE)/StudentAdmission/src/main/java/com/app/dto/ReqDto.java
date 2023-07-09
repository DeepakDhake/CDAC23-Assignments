package com.app.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import com.app.Entity.Category;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class ReqDto {
	
//	@NotBlank(message = "Enter Valid Name")
//	private String name;
//	@NotBlank(message = "Category Not Found")
//	private Category category;
	private LocalDate startDate;
	private LocalDate endDate;
	private double fee; 

}

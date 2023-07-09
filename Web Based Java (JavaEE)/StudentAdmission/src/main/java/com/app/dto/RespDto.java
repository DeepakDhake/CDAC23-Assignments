package com.app.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.app.Entity.Category;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class RespDto {
	private String name;
	private Category category;
	private LocalDate startDate;
	private LocalDate endDate;
	private double fee;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
}

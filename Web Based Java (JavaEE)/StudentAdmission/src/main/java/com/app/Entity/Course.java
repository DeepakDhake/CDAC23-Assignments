package com.app.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Course")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Course extends BaseEntity {
	@Column(name = "Course_Name", length = 20, nullable = false)
	private String name;
	@Column(name = "Category", length = 20, nullable = false)
	@Enumerated(EnumType.STRING)
	private Category category;
	@Column(name = "Start_Date", length = 20, nullable = false)
	private LocalDate startDate;
	@Column(name = "End_Date", length = 20, nullable = false)
	private LocalDate endDate;
	@Column(name = "Fees", length = 20, nullable = false)
	private double fee;
	@CreationTimestamp
	private LocalDateTime createdAt;
	@UpdateTimestamp
	private LocalDateTime updatedAt;
}

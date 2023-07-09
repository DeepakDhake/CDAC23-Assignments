package com.app.Entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Railway {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Railway_Id", nullable = false)
	private Long Id;
	
	@Column(name = "Train_Name", nullable = false, length = 25)
	@NotBlank(message = "Train Name Cannot be blank")
	private String trainName;

	@Column(name = "Train_Category", nullable = false, length = 20)
	@Enumerated(EnumType.STRING)
	private TrainCategory category;

	@Column(name = "Start_Time", nullable = false)
	private LocalDateTime startTime;

	@Column(name = "End_Time", nullable = false)
	private LocalDateTime endTime;

	@Column(name = "Source_Station", nullable = false, length = 20)
	private String Source;

	@Column(name = "Destination_Station", nullable = false, length = 20)
	private String destination;

	@Column(name = "Distance", nullable = false)
	@Positive(message = "Distance Cannot be 0")
	private double dist;

	@Column(name = "Frequency", nullable = false)
	@Positive(message = "Frequency Cannot be 0")
	private int freq;

}

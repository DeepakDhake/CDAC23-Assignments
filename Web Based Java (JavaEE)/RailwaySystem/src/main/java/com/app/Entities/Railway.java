package com.app.Entities;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Range;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;

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
	private TrainCategory Category;
	@Column(name = "Start_Time", nullable = false)
	@JsonDeserialize(using = LocalTimeDeserializer.class)
	private LocalTime startTime;
	@Column(name = "End_Time", nullable = false)
	@JsonDeserialize(using = LocalTimeDeserializer.class)
	private LocalTime endTime;
	@Column(name = "Source_Station", nullable = false, length = 20)
	private String Source;
	@Column(name = "Destination_Station", nullable = false, length = 20)
	private String destination;
	@Range(min = 1, message = "Distance Cannot be 0")
	@Column(name = "Distance", nullable = false)
	private double dist;
	@Range(min = 1, message = "Frequency Cannot be 0")
	@Column(name = "Frequency", nullable = false)
	private int freq;

}

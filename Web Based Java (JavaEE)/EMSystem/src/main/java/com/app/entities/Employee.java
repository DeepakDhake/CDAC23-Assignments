package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Email;

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
@ToString(exclude = "password")
public class Employee extends BaseEntity{
	@Column(name = "First_Name", length = 25)
	private String firstName;
	@Column(name = "Last_Name", length = 25)
	private String lastName;
	@Column(name = "Email", length = 25)
	private String email;
	@Column(name = "Password", length = 25)
	private String password;
	@Column(name = "Salary")
	private double salary;
	@Column(name = "Join_Date")
	private LocalDate joinDate;
}

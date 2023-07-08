package com.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Service.EmployeeService;
import com.app.dto.AuthReqDto;
import com.app.entities.Employee;

@RestController
@RequestMapping("/employees")
@Validated
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	public EmployeeController() {
		// TODO Auto-generated constructor stub
		System.out.println("In Employee Constructor");
	}

	@GetMapping
	List<Employee> listEmp() {
		return empService.getAllEmployee();
	}

	@PostMapping
	Employee addNewEmp(@RequestBody Employee transEmp) {
		return empService.addNewEmployee(transEmp);
	}

	@GetMapping("/{empId}")
	Employee findEmp(@PathVariable Long empId) {
		return empService.getEmpById(empId);
	}

	@DeleteMapping("/{empId}")
	String delEmp(@PathVariable Long empId) {
		return empService.deleteEmpDetails(empId);
	}

	@PutMapping
	public Employee updateEmpDetails(@RequestBody Employee detachedEmp) {

		System.out.println("in update emp " + detachedEmp);// id : not null
		return empService.updateEmpDetails(detachedEmp);
	}

	@GetMapping("Name/{empName}")
	public Employee findEmpByName(String ename) {
		return empService.getEmpByName(ename);
	}

	@PostMapping("/signin")
	public ResponseEntity<?> authenticateEmployee(@RequestBody @Valid AuthReqDto request) {
		return ResponseEntity.status(HttpStatus.OK).body(empService.validateEmp(request));
	}

}

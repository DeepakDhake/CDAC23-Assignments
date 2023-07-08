package com.app.Service;

import java.util.List;

import com.app.dto.AuthReqDto;
import com.app.dto.AuthRespDto;
import com.app.entities.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployee();

	Employee addNewEmployee(Employee newEmp);

	Employee getEmpById(Long empId);

	String deleteEmpDetails(Long empId);

	Employee updateEmpDetails(Employee detachedEmp);

	Employee getEmpByName(String e);

	AuthRespDto validateEmp(AuthReqDto request);
}

package com.app.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Repository.EmployeeRepository;
import com.app.custom_handler.ResourceNotFoundException;
import com.app.dto.AuthReqDto;
import com.app.dto.AuthRespDto;
import com.app.entities.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;

	@Autowired
	private ModelMapper mapper;

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public Employee getEmpById(Long empId) {
		return empRepo.findById(empId).orElseThrow(() -> new ResourceNotFoundException("Employee Not Found"));
	}

	@Override
	public Employee addNewEmployee(Employee newEmp) {
		// TODO Auto-generated method stub
		return empRepo.save(newEmp);
	}

	@Override
	public String deleteEmpDetails(Long empId) {
		// TODO Auto-generated method stub
		String mesg = "Employee Failed to deleted";
		if (empRepo.existsById(empId)) {
			empRepo.deleteById(empId);
			mesg = "Emp with Id = " + empId + " deleted";
		}
		return mesg;
	}

	@Override
	public Employee updateEmpDetails(Employee detachedEmp) {
		// TODO Auto-generated method stub
		return empRepo.save(detachedEmp);
	}

	@Override
	public Employee getEmpByName(String e) {
		// TODO Auto-generated method stub

		return empRepo.findByFirstName(e).orElseThrow(() -> new ResourceNotFoundException("Employee Not found"));
	}

	@Override
	public AuthRespDto validateEmp(AuthReqDto request) {
		// TODO Auto-generated method stub
		Employee emp = empRepo.findByEmailAndPassword(request.getEmail(), request.getPassword())
				.orElseThrow(() -> new ResourceNotFoundException("Signin Failed"));
		AuthRespDto authRespDto = mapper.map(emp, AuthRespDto.class);
		return authRespDto;
	}

}

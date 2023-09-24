package com.bikkadit.crudoperation.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikkadit.crudoperation.dto.EmployeeDto;
import com.bikkadit.crudoperation.exception.ResourceNotFound;
import com.bikkadit.crudoperation.model.Employee;
import com.bikkadit.crudoperation.repository.EmployeeRespository;
import com.bikkadit.crudoperation.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRespository employeeRespository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public EmployeeDto saveEmployee(EmployeeDto employeeDto) {

		Employee employee = this.modelMapper.map(employeeDto, Employee.class);

		Employee emp = this.employeeRespository.save(employee);

		return this.modelMapper.map(emp, EmployeeDto.class);
	}

	@Override
	public EmployeeDto getEmployee(Long empId) {

		Employee employee = this.employeeRespository.findById(empId)
				.orElseThrow(() -> new ResourceNotFound("Resource on Server Not Found with Id : " + empId));

		return this.modelMapper.map(employee, EmployeeDto.class);
	}

}

package com.bikkadit.crudoperation.service;

import com.bikkadit.crudoperation.dto.EmployeeDto;

public interface EmployeeService {
	
	EmployeeDto saveEmployee(EmployeeDto employeeDto);
	
	EmployeeDto getEmployee(Long empId);

}

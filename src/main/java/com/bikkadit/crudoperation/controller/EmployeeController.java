package com.bikkadit.crudoperation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadit.crudoperation.dto.EmployeeDto;
import com.bikkadit.crudoperation.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/employees")
	public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto){
		
		return new ResponseEntity<EmployeeDto>(this.employeeService.saveEmployee(employeeDto),HttpStatus.CREATED);
	}
	
	@GetMapping("/employees/{empId}")
	public ResponseEntity<EmployeeDto> getEmployee(@PathVariable Long empId){
		
		return new ResponseEntity<EmployeeDto>(this.employeeService.getEmployee(empId),HttpStatus.OK);
	}
	
}

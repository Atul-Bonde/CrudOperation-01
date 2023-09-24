package com.bikkadit.crudoperation.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

	private Long employeeId;

	private String employeeName;

	private String employeeAddress;

	private String employeeEmail;

	private String employeePassword;

}

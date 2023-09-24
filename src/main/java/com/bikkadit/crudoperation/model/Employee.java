package com.bikkadit.crudoperation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long employeeId;
	
	@Column(name="employee_name")
	private String employeeName;
	
	@Column(name="employee_address")
	private String employeeAddress;
	
	@Column(name="employee_email")
	private String employeeEmail;
	
	@Column(name="employee_password")
	private String employeePassword;

}

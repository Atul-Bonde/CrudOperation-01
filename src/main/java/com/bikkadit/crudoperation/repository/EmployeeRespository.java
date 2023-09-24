package com.bikkadit.crudoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikkadit.crudoperation.model.Employee;

public interface EmployeeRespository extends JpaRepository<Employee, Long>{

}

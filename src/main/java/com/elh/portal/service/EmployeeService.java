package com.elh.portal.service;

import java.util.List;

import com.elh.portal.entity.Employee;

public interface EmployeeService {

	void saveEmployeeDetails(Employee employee);

	List<Employee> getEmployeeDetails();

}

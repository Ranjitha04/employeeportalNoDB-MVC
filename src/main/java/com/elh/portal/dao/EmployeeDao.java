package com.elh.portal.dao;

import java.util.List;

import com.elh.portal.entity.Employee;

public interface EmployeeDao {

	void saveEmployeeDetails(Employee employee);

	List<Employee> getEmployeeDetails();

}

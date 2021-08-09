package com.elh.portal.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.elh.portal.dao.EmployeeDao;
import com.elh.portal.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	List<Employee> employeeList = new ArrayList<Employee>();
	
	@Override
	public void saveEmployeeDetails(Employee employee) {
		employeeList.add(employee);		
	}

	@Override
	public List<Employee> getEmployeeDetails() {
		return employeeList;
	}

}

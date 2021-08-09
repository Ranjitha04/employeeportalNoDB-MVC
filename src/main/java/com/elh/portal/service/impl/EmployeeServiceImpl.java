package com.elh.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elh.portal.dao.EmployeeDao;
import com.elh.portal.entity.Employee;
import com.elh.portal.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao employeeDao;
	int count;
	
	@Override
	public void saveEmployeeDetails(Employee employee) {
		employee.setEmployeeId(++count);
		employeeDao.saveEmployeeDetails(employee);
	}

	@Override
	public List<Employee> getEmployeeDetails() {
		return employeeDao.getEmployeeDetails();
	}

}

package com.elh.portal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.elh.portal.entity.Employee;
import com.elh.portal.service.EmployeeService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET) 
	public ModelAndView home(Model model1) {
		Employee employee = new Employee();
		ModelAndView model = new ModelAndView("employeeform");
		model.addObject("employee", employee);
		return model  ; 
	}
	
	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public String saveEmployee(@ModelAttribute Employee employee) {
		employeeService.saveEmployeeDetails(employee);
		return "redirect:/getEmployees";
	}
	
	@RequestMapping(value = "/getEmployees", method = RequestMethod.GET)
	public String getEmployeeDetails(Model model) {
		List<Employee> employeeList = employeeService.getEmployeeDetails();
		model.addAttribute("employeeList", employeeList);
		return "employeelist";
	}
	
}

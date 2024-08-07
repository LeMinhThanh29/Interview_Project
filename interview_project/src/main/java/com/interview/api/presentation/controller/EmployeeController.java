package com.interview.api.presentation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.interview.api.application.service.EmployeeService;
import com.interview.api.infrastructure.entity.Employee;

/**
 * Employee Controller.
 * 
 * @author leminhthanh
 */
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	/**
	 * Retrieve the list of employees.
	 *
	 * @param page the current page number (starting from 0)
	 * @param size the page size (number of employees per page)
	 * @return employee list
	 */
	@GetMapping("/employees")
	public ResponseEntity<Page<Employee>> getEmployees(@RequestParam(name = "page", defaultValue = "0") int page,
			@RequestParam(name = "size", defaultValue = "10") int size) {
		return new ResponseEntity<>(employeeService.getEmployees(page, size), HttpStatus.OK);
	}
}

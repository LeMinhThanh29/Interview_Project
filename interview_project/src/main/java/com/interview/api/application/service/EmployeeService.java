package com.interview.api.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interview.api.infrastructure.entity.Employee;
import com.interview.api.infrastructure.repository.EmployeeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

/**
 * Employee Service.
 * 
 * @author leminhthanh
 */
@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	/**
	 * Retrieve the list of employees.
	 *
	 * @param page the current page number (starting from 0)
	 * @param size the page size (number of employees per page)
	 * @return employee list
	 */
	public Page<Employee> getEmployees(int page,int size) {
		Pageable pageable = PageRequest.of(page, size);
		return employeeRepository.findAll(pageable);
	}
}

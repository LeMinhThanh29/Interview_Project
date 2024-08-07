package com.interview.api.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.interview.api.infrastructure.entity.Employee;

/** 
 * Employee Repository.
 * 
 * @author leminhthanh 
 */
@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long> {}

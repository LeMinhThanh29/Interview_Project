package com.interview.api.infrastructure.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

/**
 * Employee Entity.
 * 
 * @author leminhthanh
 */
@Entity
@Table(name = "EMPLOYEES")
@Data
public class Employee {

	/** Primary key of the employee */
	@Id
	@Column(name = "EMPLOYEE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long employeeId;

	/** Employee's first name */
	@Column(name = "FIRST_NAME")
	private String firstName;

	/** Employee's last name */
	@Column(name = "LAST_NAME")
	private String lastName;

	/** Employee's email address */
	@Column(name = "EMAIL")
	private String email;

	/** Employee's phone number */
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;

	/** Date when the employee started the job */
	@Temporal(TemporalType.DATE)
	@Column(name = "HIRE_DATE")
	private Date HireDate;

	/** Employee's current job ID, references job_id in jobs table */
	@Column(name = "JOB_ID")
	private String jobId;

	/** Employee's monthly salary */
	@Column(name = "SALARY")
	private Double salary;

	/** Employee's commission percentage, if applicable */
	@Column(name = "COMMISSION_PCT")
	private Double commissionPct;

	/** ID of the employee's manager */
	@Column(name = "MANAGER_ID")
	private Long managerId;

	/** ID of the department where the employee works */
	@Column(name = "DEPARTMENT_ID")
	private Long departmentId;

}

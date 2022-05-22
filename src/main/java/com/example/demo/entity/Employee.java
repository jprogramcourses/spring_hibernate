package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Formula;
import org.hibernate.annotations.OnDelete;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employees")
public class Employee {
	
	@Id
	@Column(name = "emp_no")
	private int empNo;
	
	@Column(name = "birth_date")
	private LocalDate birthDate;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@Column(name = "hire_date")
	private LocalDate hireDate;
	
//	@OneToOne(fetch = FetchType.LAZY, optional = false)
//	private Salary salary;

	@Formula("substr(first_name, 1, 3)")
	private String isBornBefore1990;
	
}

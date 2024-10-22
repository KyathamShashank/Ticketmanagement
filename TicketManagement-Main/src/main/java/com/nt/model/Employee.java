package com.nt.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employee")
public class Employee {

@Id
int employeeId;

@Column(length = 30)
String employeeName;

@Column(length = 30)
String employeeDesignation;

long employeePhoneNumber;

@Column(length = 30)
String employeeEmail;
	
}

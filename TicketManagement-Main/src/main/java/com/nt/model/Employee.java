package com.nt.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employee")
@Entity
public class Employee {

@Id
Integer employeeId;

@Column(length = 30)
String employeeName;

@Column(length = 30)
String employeeDesignation;

Long employeePhoneNumber;

@Column(length = 30)
String employeeEmail;
	
}

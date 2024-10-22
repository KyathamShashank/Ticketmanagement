package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Employee;
import com.nt.service.IEmployeeService;

@RestController
@RequestMapping("/employee-base")
public class EmployeeController {

@Autowired
IEmployeeService employeeService;
	
@GetMapping("/testerProfile")
public ResponseEntity<Employee> showTesterProfileById(int id)
{
	ResponseEntity<Employee> testerProfile = employeeService.showTesterProfile(id);
	return testerProfile;
}
}

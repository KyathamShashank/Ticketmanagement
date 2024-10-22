package com.nt.controller;

import java.util.Map;

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

@Autowired
Map<String,Object> mapObject;

@GetMapping("/testerProfile/{id}")
public ResponseEntity<Employee> showTesterProfileById()
{
	Object id = mapObject.get("testerId");
	ResponseEntity<Employee> testerProfile = employeeService.showTesterProfile((Integer)id);
	return testerProfile;
}
}

package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.repository.IEmployeeRepository;
@Service
public class EmployeeServiceImplementation implements IEmployeeService{
	@Autowired
	IEmployeeRepository employeeRepository;
	
	
	
	@Override
	public ResponseEntity<Employee> showTesterProfile(Integer id) {
		
		Optional<Employee> employeeOptionalObject = employeeRepository.findById(id);
		if(employeeOptionalObject.isPresent())
		{
		  Employee employee = employeeOptionalObject.get();
		  return new ResponseEntity<>(employee,HttpStatus.OK);
		}
		return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	

}

package com.nt.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;

@Service
public interface IEmployeeService {

public ResponseEntity<Employee> showTesterProfile(int id);
}

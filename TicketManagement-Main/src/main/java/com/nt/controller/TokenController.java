package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Employee;
import com.example.Entity.Project;
import com.example.Service.TokenService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TokenController {
	@Autowired
	private TokenService service;

	@PostMapping("/createproject")
	public ResponseEntity<Project> createproject(@RequestBody Project proj)
	{
		Project project = service.createProject(proj);
		return new ResponseEntity<Project>(project,HttpStatus.OK);
	}
	@PostMapping("/createemployee")
	public ResponseEntity<Employee> CreateEmployee(@RequestBody Employee emp)
	{
		  Employee createEmployee = service.CreateEmployee(emp);
		return new ResponseEntity<Employee>(createEmployee,HttpStatus.OK);
	}

	@GetMapping("/showemployee")
	public List<Employee> showAllEmployee(){
		return service.getAllEmployee();
	}

	@GetMapping("/showproject")
	public List<Project> showAllProject(){
		return service.getAllProject();
	}

	@PostMapping("/assign/{id}")
	public Project assignProject(@PathVariable Integer id,@RequestBody List<Employee> employees) {
		Project assignProjectToEMployee = service.AssignProjectToEMployee(id, employees);
		return assignProjectToEMployee;
	}
}

package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Employee;
import com.example.Entity.Project;
import com.example.Repository.EmployeeRepo;
import com.example.Repository.ProjectRepo;

@Service
public class TokenService {
	
	@Autowired
	private	ProjectRepo Prepo;
	@Autowired
	private EmployeeRepo Erepo;

	public Project createProject(Project proj) {
		Project save = Prepo.save(proj);
		return save;
	}

	public Employee CreateEmployee(Employee emp) {
		Employee save = Erepo.save(emp);
		return save;
	}

	public Project AssignProjectToEMployee(Integer pid,List<Employee> emp) {
		Prepo.deactivateProject(pid);
		Project p=Prepo.findById(pid).get();
		p.setEmployee(emp);
		return Prepo.save(p);
	}

	public List<Employee> getAllEmployee(){
		return Erepo.findAll();
	}
	public List<Project> getAllProject(){
		return Prepo.findAll();
	}
}

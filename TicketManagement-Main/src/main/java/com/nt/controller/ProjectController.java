package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.binding.ProjectDTO;
import com.example.demo.model.ProjectMini;
import com.example.demo.service.ProjectService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/project")
public class ProjectController 
{
	@Autowired
	private ProjectService service;
	
	@PostMapping("/register")
	public ResponseEntity<String> registerProject(@RequestBody ProjectDTO dto)
	{
		try
		{
			String register = service.registerProject(dto);
			return new ResponseEntity<String>(register,HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/showAll")
	public List<ProjectDTO> showAllActors()
	{
		return service.showAllProjects();
	}
	
	@PutMapping("/updateStatus")
	 public ResponseEntity<?> updateProjectStatus(@RequestBody ProjectDTO DTO) {
            ProjectMini status = service.updateProjectStatus(DTO);
            return ResponseEntity.ok(status);
    }
}

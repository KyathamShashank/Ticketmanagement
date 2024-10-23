package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.binding.ProjectDTO;
import com.example.demo.model.ProjectMini;
import com.example.demo.repo.IProjectRepo;

@Service
public class ProjectService 
{
	@Autowired
	private IProjectRepo repo;
	
	public String registerProject(ProjectDTO dto)
	{
		ProjectMini mini=new ProjectMini();
		BeanUtils.copyProperties(dto, mini);
		Integer projectId = repo.save(mini).getProjectId();
		return "project is registerd"+projectId;
	}
	
	public List<ProjectDTO> showAllProjects()
	{
		List<ProjectMini> entity=repo.findAll();
		List<ProjectDTO> dto=new ArrayList();
		for(ProjectMini all:entity)
		{
			ProjectDTO project=new ProjectDTO();
			BeanUtils.copyProperties(all,project);
			dto.add(project);
		}
		return dto;
	}
	//for updating project status
	 public ProjectMini updateProjectStatus(ProjectDTO DTO) {
			Optional<ProjectMini> byId = repo.findById(DTO.getProjectId());
	        if (byId.isPresent()) {
	             ProjectMini mini = byId.get();
	            mini.setStatus(DTO.getStatus());
	            return repo.save(mini);  // Save updated project to the database
	    }
	        return null;
	 }
}
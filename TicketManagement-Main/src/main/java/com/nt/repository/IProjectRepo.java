package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ProjectMini;

public interface IProjectRepo extends JpaRepository<ProjectMini, Integer>
{
	
}

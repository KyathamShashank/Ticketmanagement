package com.nt.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDTO 
{
	private Integer projectId;
	private String projectName;
	private String projectSummary;
	private String status;
	private String assignBy;
}

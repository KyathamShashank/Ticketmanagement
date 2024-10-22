package com.nt.model;

import com.nt.enums.ProjectStatus;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Projects")
public class ProjectMini 
{
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "profile_id_seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy=GenerationType.SEQUENCE)
	private Integer projectId;
	@Column(length=30)
	private String projectName;
	@Column(length=30)
	@Enumerated(EnumType.STRING)
	private ProjectStatus status;
	@Column(length=30)
	private String assignBy;
	@Column(length=30)
	private String testerName;
}

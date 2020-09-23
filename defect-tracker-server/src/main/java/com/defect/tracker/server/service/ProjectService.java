package com.defect.tracker.server.service;

import java.util.List;

import com.defect.tracker.data.entities.Project;

public interface ProjectService {
	public void createProject(Project project);
	public List<Project> getAllProject();
	public Project getProjectById(Long id);
	public void deleteProjectById(Long id);

}

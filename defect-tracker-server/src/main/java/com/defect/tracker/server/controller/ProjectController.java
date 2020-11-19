package com.defect.tracker.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.defect.tracker.data.entities.Project;
import com.defect.tracker.server.service.EmailService;
import com.defect.tracker.server.service.ProjectService;

@RestController
public class ProjectController {
	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private EmailService emailService;
	
	@PostMapping("/project")
	public String saveProject(@RequestBody Project project) {
		projectService.createProject(project);
		emailService.sendMail("sanpakees@gmail.com", project.getName()+"project created", project.getName());
		return "added";
	}
	@GetMapping("/project")
	public List<Project> getAllProjects(){
		return projectService.getAllProject();
	}
	@PutMapping("/project")
	public String updateProject(@RequestBody Project project) {
		projectService.createProject(project);
		return "updated";
	}
	@GetMapping("/project/{id}")
	public Project getProjectById(@PathVariable Long id){
		 return projectService.getProjectById(id);			
	}
	
	@DeleteMapping("/project/{id}")
	public String deleteProjectById(@PathVariable Long id){
		  projectService.deleteProjectById(id);	
		  return "deleted";
	}

}

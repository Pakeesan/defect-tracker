package com.defect.tracker.server.service;

import java.util.List;

import com.defect.tracker.data.entities.Module;

public interface ModuleService {
	public void createModule(Module Module);
	public List<Module> getAllModule();
	public Module getModuleById(Long id);
	public void deleteModuleById(Long id);
}

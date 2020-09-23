package com.defect.tracker.server.service;

import java.util.List;

import com.defect.tracker.data.entities.SubModule;

public interface SubModuleService {
	public void createSubModule(SubModule subModule,List<Long> userIds);
	public List<SubModule> getAllSubModule();
	public SubModule getSubModuleById(Long id);
	public void deleteSubModuleById(Long id);
}

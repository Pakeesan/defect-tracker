package com.defect.tracker.server.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.Module;
import com.defect.tracker.data.repositories.ModuleRepository;

@Service
public class ModuleServiceImpl implements ModuleService{
	@Autowired
	private ModuleRepository moduleRepository;
	@Transactional
	public List<Module> getAllModule() {
		
		return moduleRepository.findAll();
	}
	@Override
	public void createModule(Module Module) {
		moduleRepository.save(Module);
	}
	@Override
	public Module getModuleById(Long id) {
		return moduleRepository.findById(id).get();
	}
	@Override
	public void deleteModuleById(Long id) {
		moduleRepository.deleteById(id);
	}
}

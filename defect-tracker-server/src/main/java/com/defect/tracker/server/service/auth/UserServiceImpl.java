package com.defect.tracker.server.service.auth;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.defect.tracker.data.entities.Role;
import com.defect.tracker.data.entities.User;
import com.defect.tracker.data.repositories.RoleRepository;
import com.defect.tracker.data.repositories.UserRepository;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
//	@Autowired
//	private PasswordEncoder passwordEncoder;
	
	@Override
	public void createUser(User user,List<Long> roleId) {
		List<Role> rolelist=new ArrayList<Role>();	
		roleId.forEach(id -> rolelist.add(roleRepository.findById(id).get()));	
		user.setRole(rolelist);
//		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userRepository.save(user);		
	}

	@Override
	public List<User> getAlluser() {
		return userRepository.findAll();
	}

	@Override
	public User getUserById(Long id) {
		return userRepository.getOne(id);
	}

	@Override
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);
	}

}

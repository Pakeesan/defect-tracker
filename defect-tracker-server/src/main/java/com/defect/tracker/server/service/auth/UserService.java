package com.defect.tracker.server.service.auth;

import java.util.List;

import com.defect.tracker.data.entities.User;

public interface UserService {
	public void createUser(User user,List<Long> roleId);
	public List<User> getAlluser();
	public User getUserById(Long id);
	public void deleteUserById(Long id);
}

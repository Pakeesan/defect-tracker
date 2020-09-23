package com.defect.tracker.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.defect.tracker.data.dto.UserRequsestDto;
import com.defect.tracker.data.entities.User;
import com.defect.tracker.data.mapper.Mapper;
import com.defect.tracker.server.service.EmailService;
import com.defect.tracker.server.service.auth.UserService;


@RestController 
public class UserController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private EmailService emailService;
	
	@Autowired
	Mapper mapper;
	
	@PostMapping("/user")
	public String saveUser(@RequestBody UserRequsestDto userReq) {
//		user.setPassword("hardcore");
		
		userService.createUser(mapper.map(userReq, User.class),userReq.getRoleId());
		
//		emailService.sendMail("sanpakees@gmail.com", user.getName()+"User created", user.getName());
		return "added";
	}
	@GetMapping("/user")
	public List<User> getAllUsers(){
		return userService.getAlluser();
	}
	@PutMapping("/user")
	public String updateUser(@RequestBody User user) {
//		userService.createUser(user);
		return "updated";
	}
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable Long id){
		 return userService.getUserById(id);			
	}
}

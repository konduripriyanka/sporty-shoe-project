package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
	@Autowired
	UserDAO dao;
	 
	@PostMapping("/insertuser")
	 public User insert(@RequestBody User u) {
		 return dao.insert(u);
	 }
}

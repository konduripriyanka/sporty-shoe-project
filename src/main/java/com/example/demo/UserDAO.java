package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDAO {
@Autowired
Userrepo repou;

 public User insert(User u) {
	 return repou.save(u);
 }
 public List<User> getall(){
	  return repou.findAll();
}
}
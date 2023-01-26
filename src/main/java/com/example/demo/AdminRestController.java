package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminRestController {
 @Autowired
 AdminDAO dao;
 
 @PostMapping("/insertadmin")
 public Admin insert(@RequestBody Admin a) {
	 return dao.insert(a);
 }
}

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {
	@Autowired
	BankDAO dao;
	
	@PostMapping("/insertbank")
	 public Bank insert(@RequestBody Bank b) {
		 return dao.insert(b);
	 }
}

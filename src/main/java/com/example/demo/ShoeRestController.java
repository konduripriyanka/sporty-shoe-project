package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoeRestController {

	@Autowired
	ShoesDAO dao;
	
	@PostMapping("/insertshoe")
	public Shoes insert(@RequestBody Shoes s) {
		return dao.insert(s);
	}
	
	@GetMapping("/getall")
	public List<Shoes> getall(){
		return dao.getall();
	}				
		
	
}

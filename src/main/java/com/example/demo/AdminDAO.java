package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminDAO {
@Autowired
Adminrepo repoa;

   public Admin insert(Admin a) {
	   return repoa.save(a);
   }
   public List<Admin> getall(){
		  return repoa.findAll();
	  }
}

package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoesDAO {
@Autowired
Shoesrepo repos;
   
  public Shoes insert(Shoes s) {
	  return repos.save(s);
  }
  public List<Shoes> getall(){
	  return repos.findAll();
  }
}

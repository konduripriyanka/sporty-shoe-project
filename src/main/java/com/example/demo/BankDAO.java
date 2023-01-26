package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankDAO {
@Autowired
Bankrepo repob;

   public Bank insert(Bank b) {
	   return repob.save(b);
   }
}

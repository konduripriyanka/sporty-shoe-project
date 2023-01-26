package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Adminrepo extends JpaRepository<Admin, Integer>{
@Query("select a.password from Admin a where a.aname=?1")
   public String adCheck(String s);
}

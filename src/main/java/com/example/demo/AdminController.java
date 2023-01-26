package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
@Autowired
AdminDAO dao;

@RequestMapping("/insertadmin")
public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	Admin a=new Admin();
	a.setAname(request.getParameter("aname"));
	String aname=a.getAname();
	a.setPassword(request.getParameter("password"));
	String password=a.getPassword();
    
	if(aname.equals(password)) {
		
		mv.setViewName("insertshoe.jsp");
	}
	else {
		String msg="Incorrect password..... ";
		mv.addObject("msg",msg);
		mv.setViewName("adminlogin.jsp");
	}
	
	return mv;
}
}

package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
@Autowired
UserDAO dao;

@RequestMapping("/insertuser")
public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	User u=new User();
    u.setUname(request.getParameter("uname"));
    String uname=u.getUname();
    u.setPassword(request.getParameter("password"));
    String password=u.getPassword();
    
    if(uname.equals(password))
    {
    	mv.setViewName("listofshoestouser.jsp");
    }
    else {
    	String msg="Invalid username and password...";
    	mv.setViewName("userlogin.jsp");
    	mv.addObject("msg", msg);
    	
    }
	return mv;
}

}
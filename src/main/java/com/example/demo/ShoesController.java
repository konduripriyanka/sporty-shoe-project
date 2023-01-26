package com.example.demo;

import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShoesController {
@Autowired
ShoesDAO dao;

@RequestMapping("/")
public ModelAndView indexx(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
    mv.setViewName("index.jsp");
    
	return mv;
}

@RequestMapping("/insertshoe")
public ModelAndView insertcontrol(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	Shoes s=new Shoes();
  
    s.setShname(request.getParameter("shname"));
    s.setShprice(Integer.parseInt(request.getParameter("shprice")));
    Shoes s1=dao.insert(s);
    if(s1!=null) {
    	mv.setViewName("successinsert.jsp");
    }
	return mv;
}

@RequestMapping("/getallshoes")
public ModelAndView displayall(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	 
	List<Shoes> list=dao.getall();
    mv.setViewName("shoelist.jsp");
    mv.addObject("list", list);
    return mv;
}
@RequestMapping("/getallshoestouser")
public ModelAndView displayshoesuser(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	 
	List<Shoes> list=dao.getall();
    mv.setViewName("usershoelist.jsp");
    mv.addObject("list", list);
    return mv;
}
}

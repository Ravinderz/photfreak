package com.photofreak.web.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.photofreak.web.model.User;
import com.photofreak.web.service.UserService;

@Controller
public class InitialController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value="/", method=GET)
	public String home(){
		return "home";
	}
	
	@RequestMapping(value="/authenticate" , method=POST)
	public String login(){
		return "welcome";
	}
	
	@RequestMapping(value="/register", method=POST)
	public String signUp(HttpServletRequest req){
		User user = new User();
		System.out.println((String)req.getAttribute("fname"));
		user.setFirstName((String)req.getAttribute("fname"));
		user.setLastName((String)req.getAttribute("lname"));
		user.setUsername((String)req.getAttribute("username"));
		user.setPassword((String)req.getAttribute("pword"));
		userService.saveUser(user);
		return "welcome";
	}
	
	@RequestMapping(value="/navlisthtml/{num}", method=GET)
	public String renderNavPage(@PathVariable("num") int num){
		System.out.println("the number clicked :: "+num);
		return "renderpage";
	}
}

package com.photofreak.web.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
	
	@RequestMapping(value="/authenticate" , method=GET)
	public String login(Model model){
		model.addAttribute("user" ,new User());
		model.addAttribute("error",false);
		return "login";
	}
	
	@RequestMapping(value="/authenticate" , method=POST)
	public String login(@Valid User user, BindingResult result,Model model){
		if(result.hasErrors()){
			return "login";
		}
		boolean isUserValid = userService.authenticateUser(user);
		System.out.println(isUserValid);
		if(isUserValid){
			model.addAttribute("User",user);
			model.addAttribute("error",false);
			return "welcome";
		}
		model.addAttribute("error", true);
		return "login";
	}
	
	@RequestMapping(value="/register", method=GET)
	public String signUp(Model model){
		model.addAttribute("user", new User());
		return "signup";
	}
	
	@RequestMapping(value="/register", method=POST)
	public String signUp(@Valid User user, BindingResult result,Model model){
		
		if(result.hasErrors()){
			return "signup";
		}
		userService.saveUser(user);
		model.addAttribute("User",user);
		return "welcome";
	}
	
	@RequestMapping(value="/navlisthtml/{num}", method=GET)
	public String renderNavPage(@PathVariable("num") int num){
		System.out.println("the number clicked :: "+num);
		return "renderpage";
	}
}

package com.tts.Radiate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tts.Radiate.service.UserService;

@RequestMapping
@Controller
public class AuthorizationController {

	@Autowired
	private UserService userService;
	
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
}

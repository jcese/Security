package com.example.demo.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HoneController {
	@GetMapping(value="/")
	public String welcome() {
		@SuppressWarnings("unused")
		UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext()
				.getAuthentication()
				.getPrincipal();
		return "login1";

	}
	@GetMapping(value="/login")
	public String login() {
		return"login";
	}
		
	
}

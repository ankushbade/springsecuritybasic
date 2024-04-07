package com.example.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeComtroller 
{
	@GetMapping("/welcome")
	public String welcome() 
	{
		return "Welcome to spring boot  security";
		
	}
}

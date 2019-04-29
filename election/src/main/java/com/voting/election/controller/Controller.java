package com.voting.election.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class Controller {

	
	@GetMapping("/")
	public String printMessege()
	{
		
		
		return "Hello World";
	}
	
}

package com.example.testing.testing.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
	
	
	@RequestMapping("/")
	public String welcomeController()
	{
		return "This is welcome Controller";
	}
	
	@RequestMapping("/home")
	public String homeController()
	{
		return "This is Home Controller";
	}
   
}

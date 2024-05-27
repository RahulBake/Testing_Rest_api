package com.example.testing.testing.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
	
	
	@RequestMapping("/")
	public String welcomeController()
	{
		return "Hi Welcome, This is Welcome Controller.";
	}
	
	@RequestMapping("/home")
	public String homeController()
	{
		return "This is Home Controller ok";
	}


	@RequestMapping("/back")
	public String BackController()
	{
		return "Back to home page";
	}
   
}

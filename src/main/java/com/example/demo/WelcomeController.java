package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {
	
	
	
	@GetMapping("/mumbai")
	public String getMassage() {
		String msg="Welcome in mumbai......";
		return msg;
	}

}

package com.ec2test.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class TestController {
	
	
	@GetMapping("/")
	public String welcome() {
		return "Test Success full...";
	}
	
}

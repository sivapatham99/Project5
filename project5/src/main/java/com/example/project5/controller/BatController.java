package com.example.project5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class BatController {
	
	@GetMapping("/he")
	public String sayHello() {
		return "HEllo";
	}
	
	

}

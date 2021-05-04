package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
	@GetMapping
	public String getHome() {
		return "welcome to spring boot";
	}
}

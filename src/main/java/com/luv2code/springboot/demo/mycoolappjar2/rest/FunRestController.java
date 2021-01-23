package com.luv2code.springboot.demo.mycoolappjar2.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	// expose "/" that return "Hello World"
	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time on server is "+ 
	LocalDateTime.now();
	}
	
	// expose a new endpoint for "workout"
	@GetMapping("/workout")
	public String getWorkout() {
		return "Runn hard 5k";
	}
	
	// expose a new endpoint for "fortune"
	
	@GetMapping("/fortune")
	public String getFortune() {
		return "Today is your lucky day";
	}
}

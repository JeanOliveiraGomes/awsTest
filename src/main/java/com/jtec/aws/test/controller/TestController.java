package com.jtec.aws.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping
	public String getTest() {
		return "Teste funcionando.";
	}
	
	@GetMapping("/health")
	public String heath() {
		return "aplicação saudavel";
	}
}

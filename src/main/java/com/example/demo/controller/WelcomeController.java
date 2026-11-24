package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Welcome")

public class WelcomeController {
@GetMapping
public String welcome() {
	return "WElCOME TO Github and Jenkins";
}
}

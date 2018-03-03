package com.helloworld.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
   @RequestMapping("/")
	public String Home() {
		return "Hello World!";
	}
}

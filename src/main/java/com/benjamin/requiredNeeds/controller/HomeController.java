package com.benjamin.requiredNeeds.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	 @RequestMapping("/")
	    public String welcome(Map<String, Object> model) {
	        return "home.html";
	    }

}

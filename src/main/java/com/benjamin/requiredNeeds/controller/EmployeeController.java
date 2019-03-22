package com.benjamin.requiredNeeds.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	 @RequestMapping("/employee")
	    public String getEmployees()
	    {
	      
	      return " HEllo from ther other side222";
	    }

}

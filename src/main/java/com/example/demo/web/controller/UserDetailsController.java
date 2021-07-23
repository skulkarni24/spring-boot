package com.example.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDetailsController {
	
	@RequestMapping(value="/getUserDetails" , method=RequestMethod.GET)
	public String getUserDetails() {
		return "swetha.....";
		
	}

}

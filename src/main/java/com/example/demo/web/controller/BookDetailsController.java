package com.example.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookDetailsController {
	
	@RequestMapping(value="/showBookDetails" , method=RequestMethod.GET)
	public String showBooksDetails() {
		return "book";
		
	}

	@RequestMapping(value="/showBooks" , method=RequestMethod.GET)
	@ResponseBody
	public String showString() {
		return "book";
		
	}
	

}

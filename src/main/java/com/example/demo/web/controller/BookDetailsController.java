package com.example.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	public String showString(ModelMap model) {
	
		return "book";
		
	}

	@ModelAttribute
	public void addAttributes(Model model) {
		model.addAttribute("name", "Vijay Simha");
	}

}

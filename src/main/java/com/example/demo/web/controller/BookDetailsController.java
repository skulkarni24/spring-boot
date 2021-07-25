package com.example.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.web.model.Books;

@Controller
public class BookDetailsController {
	
	@RequestMapping(value="/showBookDetails" , method=RequestMethod.GET)
	@ResponseBody
	public String showBooksDetails() {
		return "book";
		
	}

	@RequestMapping(value="/showBooks" , method=RequestMethod.GET)
	public ModelAndView showString(Model model) {
		ModelAndView mav = new ModelAndView();
		Books books = new Books();
		books.setName("Java");
		books.setDescription("java 8 code");
		mav.getModelMap().put("book", books);
	    mav.setViewName("book");
		return mav;
	}

	/*
	 * @ModelAttribute public void addAttributes(Model model) {
	 * 
	 * }
	 */
}

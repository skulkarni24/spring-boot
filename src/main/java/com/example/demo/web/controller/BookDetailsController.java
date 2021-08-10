package com.example.demo.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.web.dao.Employee;
import com.example.demo.web.model.Books;

@Controller
public class BookDetailsController {
	
	
	@RequestMapping(value="/showBookDetails" , method=RequestMethod.GET)
	@ResponseBody
	public List<Books> showBooksDetails() {
		List<Books>books = new ArrayList<Books>();
		Books b1 = new Books();
		Books b2 = new Books();
		b1.setName("book1");
		b2.setName("book2");
		books.add(b2);
		books.add(b1);
		return books;
		
	}

	@ResponseBody
	@RequestMapping(value="/savestring" , method=RequestMethod.POST)
	public void saveEmpDetails(@RequestBody String e) {
		System.out.println(e);	
	}
	
	@RequestMapping(value="/showBooks" , method=RequestMethod.GET)
	public ModelAndView showString(Model model) {
		ModelAndView mav = new ModelAndView();
		Books books = new Books();
		books.setName("Java....................");
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

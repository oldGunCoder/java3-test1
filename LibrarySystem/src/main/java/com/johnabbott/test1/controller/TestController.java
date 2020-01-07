package com.johnabbott.test1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.johnabbott.test1.model.Book;
import com.johnabbott.test1.service.BookService;

@Controller
public class TestController {
	
	@Autowired
	BookService service;
	
	@RequestMapping("/testmethod")
	public ModelAndView getName() {
		ModelAndView mv = new ModelAndView("test-jsp");
		mv.addObject("obj", "reza");

		return mv;
	}

	@RequestMapping(value = "/getbooks", method = RequestMethod.GET)
	public ModelAndView getStudentsList() {
		ModelAndView modelView = new ModelAndView("book-list");

		List<Book> books = service.getBooks();
		modelView.addObject("bookList", books);
		
		return modelView;
	}

}

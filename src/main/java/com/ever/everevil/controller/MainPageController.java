package com.ever.everevil.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainPageController {
	
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView("thymeleaf.html");
		mv.addObject("hello", "hello thymeleaf !!");
		return mv;
	}
	
	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("views/index.html");
		mv.addObject("hello", "hello thymeleaf !!");
		return mv;
	}
}

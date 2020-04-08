package com.springsessions.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeDemo {
	@RequestMapping("/homedemo")
	public String showHomeDemoPage() {
		return "HomeDemo";
	}

	@RequestMapping("/home")
	public ModelAndView showHomePage() {
		ModelAndView  modelAndView = new ModelAndView("Home");
		modelAndView.addObject("pageTitle", "Home Page");
		modelAndView.addObject("message", "This is home page.");
		return modelAndView;
	}
}

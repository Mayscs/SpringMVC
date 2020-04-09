package com.springsessions.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormProcessController {

	//Controller method to show form
	@RequestMapping("/showForm")
	public String showFormPage() {
		return "FormProcess/showForm";
	}

	//Controller method to output and process the input data
	@RequestMapping("/processForm")
	public String processedFormPage() {
		return "FormProcess/processedForm";
	}
}

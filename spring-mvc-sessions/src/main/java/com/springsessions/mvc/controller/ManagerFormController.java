package com.springsessions.mvc.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springsessions.mvc.entity.Manager;

@Controller
@RequestMapping("/manager1")
public class ManagerFormController {

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@RequestMapping("/showForm")
	public String enterDetails(Model model) {
		Manager myManager = new Manager();
		model.addAttribute("manager", myManager);
		return "manager-details-page";
	}

	//@RequestMapping("/viewProcessedPage")
	@RequestMapping("/processForm")
	public String viewProcessedData(@Valid @ModelAttribute("manager") Manager theManager, BindingResult bindingResult) {
		if (bindingResult.hasErrors())
			return "manager-details-page";
		else
			return "manager-confirmation-page";
	}
}

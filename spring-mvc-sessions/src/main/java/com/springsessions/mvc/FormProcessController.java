package com.springsessions.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	//Read form data and Process it. Add processed data to the model.
	@RequestMapping("/processedFormData")
	public String processAndAddToModel(HttpServletRequest request, Model myModel) {
		String candidateName = request.getParameter("candidateName");
		candidateName = "** " + candidateName.toUpperCase() + " ** " ;
		myModel.addAttribute("upperCaseName", candidateName);
		return "FormProcess/processedFormData";
	}

	@RequestMapping("/processedFormDataV1")
	public String processAndAddToModelV1(@RequestParam("candidateName") String candidateName, Model myModel) {
		candidateName = "~~" + candidateName.toUpperCase() + "~~" ;
		myModel.addAttribute("upperCaseName", candidateName);
		return "FormProcess/processedFormData" ;
	}

}

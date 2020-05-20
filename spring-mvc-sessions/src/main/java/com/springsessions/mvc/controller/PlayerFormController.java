package com.springsessions.mvc.controller;


import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springsessions.mvc.entity.Player;

@Controller
@RequestMapping("/player")
public class PlayerFormController {

	@Value("#{countryOptions}")
	private Map<String,String> countryOptions;

	@RequestMapping("/showForm")
	public String showPlayerForm(Model myModel) {
		Player cricketPlayer = new Player();
		myModel.addAttribute("sportsPerson", cricketPlayer);
		myModel.addAttribute("myCountryOptions", countryOptions);
		return "player-details-page";
	}

	@RequestMapping("/processForm")
	public String processPlayerForm(@Valid @ModelAttribute("sportsPerson") Player player, BindingResult bindingResult) {
		System.out.println("Player Name:" + player.getFirstName() + " " + player.getLastName());
		if (bindingResult.hasErrors())
			return "player-details-page" ;
		else
			return "player-confirmation-page";
	}

}

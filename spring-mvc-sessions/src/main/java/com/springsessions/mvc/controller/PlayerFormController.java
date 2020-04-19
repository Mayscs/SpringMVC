package com.springsessions.mvc.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String processPlayerForm(@ModelAttribute("sportsPerson") Player player) {
		System.out.println("Player Name:" + player.getFirstName() + " " + player.getLastName());
		return "player-confirmation-page";
	}

}

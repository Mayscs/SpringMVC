package com.springsessions.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springsessions.mvc.entity.Player;

@Controller
@RequestMapping("/player")
public class PlayerFormController {

	@RequestMapping("/showForm")
	public String showPlayerForm(Model myModel) {

		Player cricketPlayer = new Player();

		myModel.addAttribute("sportsPerson", cricketPlayer);
		return "player-details-page";
	}

	@RequestMapping("/processForm")
	public String processPlayerForm(@ModelAttribute("sportsPerson") Player player) {

		System.out.println("Player Name:" + player.getFirstName() + " " + player.getLastName());
		return "player-confirmation-page";
	}
}

package com.springsessions.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springsessions.mvc.entity.Player;

@Controller
@RequestMapping("/player")
public class PlayerFormController {

	@RequestMapping("/showForm")
	public String showPlayerForm(Model myModel) {

		Player cricketPlayer = new Player();

		myModel.addAttribute("cricketPerson", cricketPlayer);
		return "player-details-Form";
	}
}

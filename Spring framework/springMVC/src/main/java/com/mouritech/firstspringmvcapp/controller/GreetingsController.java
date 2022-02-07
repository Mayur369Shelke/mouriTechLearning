package com.mouritech.firstspringmvcapp.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mouritech.firstspringmvcapp.model.Greetings;

@Controller
public class GreetingsController {
	
	@RequestMapping("/saygreeting")
	public String greetingHandler(Model model) {
		
		Greetings greetings = new Greetings();
		greetings.setMessage("Good Morning");
		greetings.setDatatime(LocalDate.now().toString());
		model.addAttribute("greetingsobj", greetings);
		return "greetings";
	}

}

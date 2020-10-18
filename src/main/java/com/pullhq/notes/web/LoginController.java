package com.pullhq.notes.web;

import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("currentTime", LocalTime.now());
		return "index";
	}
}

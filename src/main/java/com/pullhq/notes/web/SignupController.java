package com.pullhq.notes.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignupController {
	@GetMapping("/signup")
	public String showSignupForm() {
		return "signup";
	}
}

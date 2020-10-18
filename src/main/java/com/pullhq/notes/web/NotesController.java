package com.pullhq.notes.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NotesController {
	@GetMapping("/notes")
	public String listNotes() {
		return "listnotes";
	}
}

package by.htp.nikonov.task03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexPageCommand {
	
	@RequestMapping("/")
	public String redirectToStartPage() {
		
		return "redirect:news-list";
	}
}

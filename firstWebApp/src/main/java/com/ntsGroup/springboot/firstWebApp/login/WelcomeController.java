package com.ntsGroup.springboot.firstWebApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("name") // this will made available in all models
public class WelcomeController {

	@GetMapping("/")
	public String gotoWelcomePage(ModelMap model) {
		model.put("name", "in28Minutes");
		return "welcome";
	}
}

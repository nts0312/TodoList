package com.ntsGroup.springboot.firstWebApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name") // this will made available in all models
public class LoginController {

	@RequestMapping(value="login", method = RequestMethod.GET)
	public String gotoLoginPage(ModelMap model) {
		model.put("name", "in28Minutes");
		return "welcome";
	}
}

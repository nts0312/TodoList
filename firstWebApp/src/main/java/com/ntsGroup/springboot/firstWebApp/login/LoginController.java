package com.ntsGroup.springboot.firstWebApp.login;

import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired
	private AuthenticationService authenticationService;

	@RequestMapping(value="login", method = RequestMethod.GET)
	public String gotoLoginPage() {
		return "login";
	}

	@PostMapping("login")
	public String gotoWelcomePage(@RequestParam String name , @RequestParam String password, ModelMap model) { //password . name must be same as the name declared in jsp

		boolean validUser = authenticationService.authenticate(name, password);

		if (validUser) {

			model.put("name", name);
			model.put("password", password);
			return "welcome";
			
		} else {
			model.put("errorMessage", "Invalid User!!!");
			return "login";}
	}
}

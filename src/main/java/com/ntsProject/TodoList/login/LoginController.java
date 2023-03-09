package com.ntsProject.TodoList.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ntsProject.TodoList.login.service.AuthenticationService;

@Controller
@SessionAttributes("name")
public class LoginController {

	@Autowired
	private AuthenticationService authenticationService;

	// till now it is dealing with both post and get request --------- need to
	// separate the post call method as to switch on new page after clicking on
	// submit button
	// @RequestMapping(value = "login", method = RequestMethod.GET)
	// ------OR---------
	@GetMapping("login")
	// public String showLoginPage(@RequestParam String name, ModelMap model) {
	public String showLoginPage() {
//			model.put("name", name);
//			logger.info(name);
//			logger.debug("Here is the new value ----------------- ${}", name);
		return "loginPage";
	}

	@PostMapping("login")
	// public String showLoginPage(@RequestParam String name, ModelMap model) {
	public String showWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
		if (authenticationService.authenticationUser(name, password)) {

			model.put("name", name);
			return "welcome";
		} else {
			model.put("error", "Invalid Cred ----- Please Check");
			return "loginPage";
		}
	}
}
// check for parameter name change

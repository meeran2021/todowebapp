package com.meeran.springboot.todowebapp.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username") // To make it available to this scope as well. It will become available to model.
public class WelcomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String goToLoginPage(ModelMap model) {
		model.put("username", getLoggedInUsername());
		return "Welcome";
	}

	public String getLoggedInUsername() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
}

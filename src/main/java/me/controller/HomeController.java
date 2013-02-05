package me.controller;

import me.domain.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	@ResponseBody
	public User xml() {
		User user = new User();
		user.setName("William");
		user.setPassword("pwd");
		return user;
	}

}

package demo.controller;

import demo.manager.WelcomeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@Autowired
	WelcomeManager welcomeService;

	@GetMapping("/welcome/{username}")
	public String getName(@PathVariable("username") String userName) {
		return welcomeService.getName(userName);
	}
}

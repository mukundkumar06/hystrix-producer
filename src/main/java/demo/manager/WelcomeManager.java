package demo.manager;

import org.springframework.stereotype.Service;

@Service
public class WelcomeManager {
	public String getName(String userName) {
		System.out.println("Inside WelcomeService: getName");
		return String.format("Hello %s\n", userName);
	}
}

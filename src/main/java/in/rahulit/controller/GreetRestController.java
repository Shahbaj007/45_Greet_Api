package in.rahulit.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.rahulit.client.WelcomeApiClient;

@RestController
public class GreetRestController {
	
	@Autowired
	private WelcomeApiClient welcomeClient;
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		
		String welcomeMessage = welcomeClient.invokeWelcomeMsg();
		
		String greetMsg = "Good Morning, ";
				
		return greetMsg.concat(welcomeMessage);
		
	}
	
}

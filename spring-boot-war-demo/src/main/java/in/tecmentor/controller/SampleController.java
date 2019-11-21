package in.tecmentor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping(value = "/welcome-msg")
	public String getWelcomeMsg() {
		return "Welcome in spring boot war creation demo.";
	}

}

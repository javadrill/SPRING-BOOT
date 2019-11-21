package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Class SimpleController.
 */
@RestController
public class SimpleController {

	/**
	 * Gets the welcome msg.
	 *
	 * @return the welcome msg
	 */
	@GetMapping(value = "/welcome-msg")
	public String getWelcomeMsg() {
		return "Welcome in Spring Boot world.";
	}

	/**
	 * Gets the sum result.
	 *
	 * @param firstNum
	 *            the first num
	 * @param secondNum
	 *            the second num
	 * @return the sum result
	 */
	@GetMapping(value = "/sum")
	public Long getSumResult(Long firstNum, Long secondNum) {
		return firstNum + secondNum;
	}
}

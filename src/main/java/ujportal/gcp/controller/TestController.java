package ujportal.gcp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	/**
	 * Send message.
	 *
	 * @return the string
	 */
	@GetMapping("/getMessage")
	public String sendMessage() {

		return "Welcome to  the World of GCP!!!";

	}

}

package learing.springboot.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@RequestMapping("/hello")
	public String index() {
		return "Hello World";
	}

	@RequestMapping("/bye")
	public String goodbye() {
		return "See you~~~~";
	}

	
}

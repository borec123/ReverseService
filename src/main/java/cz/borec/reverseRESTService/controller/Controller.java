package cz.borec.reverseRESTService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cz.borec.reverseRESTService.service.ReverseService;

@RestController
public class Controller {

	@Autowired
	private ReverseService reverseService;


	@GetMapping("/reverse/{text}")
	public String reverse(@PathVariable String text) {
		return reverseService.reverse(text);
	}

	@PostMapping(path = "/post", consumes = MediaType.TEXT_PLAIN_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
	public String post(@RequestBody String text) {
		return text;
	}

}

package cz.borec.reverseRESTService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

}

package cz.borec.reverseRESTService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cz.borec.reverseRESTService.service.ReverseService2;

@RestController
public class Controller {

	@Autowired
	private ReverseService2 reverseService;


	@GetMapping("/reverse/{text}")
	public String retrieveDetailsForCourse(@PathVariable String text) {
		return "Žluťoučký kůň. " + text + " kokot " + reverseService.reverse(text);
	}

}

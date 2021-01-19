package cz.borec.reverseRESTService.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cz.borec.reverseRESTService.service.FirstDuplicate;
import cz.borec.reverseRESTService.service.ReverseService1;
import cz.borec.reverseRESTService.service.ReverseService2;
import cz.borec.reverseRESTService.service.SubString;

@RestController
public class Controller {

	@Autowired
	private ReverseService1 reverseService;

	@Autowired
	private ReverseService2 reverseService2;

	@Autowired
	private FirstDuplicate firstDuplicate;

	@Autowired
	private SubString subString;


	@GetMapping("/reverse/{text}")
	public String reverse(@PathVariable String text) {
		return reverseService.reverse(text);
	}

	@GetMapping("/reverse2/{text}")
	public String reverse2(@PathVariable String text) {
		return reverseService2.reverse(text);
	}

	@GetMapping("/firstDuplicate/{text}")
	public String firstDuplicate(@PathVariable String text) {
		return String.valueOf(firstDuplicate.uniqueChars(text));
	}

	@GetMapping("/uniqueCharacterSubstring/{text}")
	public Set<String> getUniqueCharacterSubstring(@PathVariable String text) {
		return subString.getUniqueCharacterSubstring(text);
	}

	@PostMapping(path = "/post", consumes = MediaType.TEXT_PLAIN_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
	public String post(@RequestBody String text) {
		return text;
	}

}

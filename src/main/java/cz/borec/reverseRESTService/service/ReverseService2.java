package cz.borec.reverseRESTService.service;

import org.springframework.stereotype.Component;

@Component
public class ReverseService2 extends ReverseServiceBase {

	private static final char SPACE = ' ';
	
	@Override
	public String reverse(String input) {
		if(input == null) return null;
		String s = reverseInternal(input);
	    s = removeSpaces(s);
		return s;
	}

	protected String reverseInternal(String input) {
		char c; 
	    StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length() ; i++) {
			c = input.charAt(input.length() - i - 1);
			c = CHARS.contains(input.charAt(i)) ? Character.toUpperCase(c) : Character.toLowerCase(c);
			sb.append(c);
		}
		return sb.toString();
	}
	
	protected String removeSpaces(String input) {
		char current, previous = (char)-1; // some initial value
	    StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length() ; i++) {
			current = input.charAt(i);
			if(!(previous == current && current == SPACE)) {
				sb.append(current);
			}
			previous = current;
		}
		return sb.toString();
	}



}

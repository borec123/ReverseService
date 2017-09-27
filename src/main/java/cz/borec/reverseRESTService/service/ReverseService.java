package cz.borec.reverseRESTService.service;

import org.springframework.stereotype.Component;

@Component
public class ReverseService extends ReverseServiceBase {

	private static final char SPACE = ' ';
	
	@Override
	public String reverse(String input) {
		if(input == null) return null;
		return reverseInternal(input);
	}

	/**
	 * Implements a string reverse algorithm.
	 * Positions with letters {a, e, i, o, u} are Uppercased otherwise lowercased,
	 * For the given input 'Ahoj, jak se máš?' it returns '?šÁm es kaj ,joha'.
	 * @param input
	 * @return
	 */
	protected String reverseInternal(String input) {
		char current, previous = (char)-1; // some initial value
	    StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length() ; i++) {
			current = input.charAt(input.length() - i - 1);
			current = CHARS.contains(input.charAt(i)) ? Character.toUpperCase(current) : Character.toLowerCase(current);
			if(!(previous == current && current == SPACE)) {
				sb.append(current);
			}
			previous = current;
		}
		return sb.toString();
	}
	

}

package cz.borec.reverseRESTService.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

/**
 * Implements a string reverse algorithm.
 * Positions with letters {a, e, i, o, u} are Uppercased otherwise lowercased.
 * Two or more sequent spaces are replaced with one space.
 * For the given input 'Ahoj, jak se máš?' it returns '?šÁm es kaj ,joha'.
 * @param input - Input string.
 * @return For the given input 'Ahoj, jak se máš?' it returns '?šÁm es kaj ,joha'.
 */
@Component
public class ReverseService1 implements ReverseServiceInterface {

	protected static final char SPACE = ' ';
	protected static Set<Character> CHARS;

	static {
		CHARS = new HashSet<Character>();
		CHARS.add('a');
		//CHARS.add('á');
		CHARS.add('e');
		CHARS.add('i');
		CHARS.add('o');
		CHARS.add('u');
	}	
	
	/**
	 * Returns reversed string.
	 * For the given input 'Ahoj, jak se máš?' it returns '?šÁm es kaj ,joha'.
	 * @param input - Input string.
	 * @return For the given input 'Ahoj, jak se máš?' it returns '?šÁm es kaj ,joha'.
	 */
	public String reverse(String input) {
		if(input == null) return null;
		return reverseInternal(input);
	}

	/**
	 * Implements a string reverse algorithm.
	 * Positions with letters {a, e, i, o, u} are Uppercased otherwise lowercased.
	 * Two or more sequent spaces are replaced with one space.
	 * For the given input 'Ahoj, jak se máš?' it returns '?šÁm es kaj ,joha'.
	 * @param input - Input string.
	 * @return For the given input 'Ahoj, jak se máš?' it returns '?šÁm es kaj ,joha'.
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

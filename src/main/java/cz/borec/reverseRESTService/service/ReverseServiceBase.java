package cz.borec.reverseRESTService.service;

import java.util.HashSet;
import java.util.Set;

public abstract class ReverseServiceBase implements ReverseServiceInterface {

	protected static Set<Character> CHARS;

	@Override
	public abstract String reverse(String input);
	
	static {
		CHARS = new HashSet<Character>();
		CHARS.add('a');
		//CHARS.add('á');
		CHARS.add('e');
		CHARS.add('i');
		CHARS.add('o');
		CHARS.add('u');
	}

}

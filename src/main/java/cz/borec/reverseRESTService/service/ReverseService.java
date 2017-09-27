package cz.borec.reverseRESTService.service;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;


@Component
public class ReverseService extends ReverseServiceBase {
	
	private static final String SPACE = " ";
	private static final String PATTERN = SPACE + "+";
	private Pattern spaceCharsEliminator;
	
	
	public ReverseService() {
		super();
		
		this.spaceCharsEliminator = Pattern.compile(PATTERN);
		
		
	}


	private boolean[] index(String input) {
		boolean[] bitmap = new boolean[input.length()];
		for (int i = 0; i < bitmap.length; i++) {
			bitmap[i] = CHARS.contains(input.charAt(i));
		}
		return bitmap;
	}
	
	
	protected String reverseInternal(String input) {
		return new StringBuffer(input).reverse().toString();
	}
	
	public String reverse(String input) {
		if(input == null) return null;
		boolean[] bitmap = index(input);
		String reverse = reverseInternal(input);
		String retval = convertUpperCase(reverse, bitmap);
		retval = removeSpaces(retval);
		return retval;
	}


	private String removeSpaces(String retval) {
		
		return this.spaceCharsEliminator.matcher(retval).replaceAll(SPACE);
		
		//return retval.replaceAll(PATTERN, " ");

	}


	private String convertUpperCase(String input, boolean[] bitmap) {
		char[] retvalue = new char[bitmap.length];
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			retvalue[i] = bitmap[i] ? Character.toUpperCase(c) : Character.toLowerCase(c);
		}
		return new String(retvalue);
	}
	

	

}
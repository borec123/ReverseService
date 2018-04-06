package cz.borec.reverseRESTService.service;

import org.springframework.stereotype.Component;

/**
 * Returns an exact reverse of the given string. 
 */
@Component
public class ReverseService2 implements ReverseServiceInterface {


	/**
	 * Returns an exact reverse of the given string. 
	 */
	public String reverse(String input) {
		if (input == null)
			return null;
		return reverseInternal(input);
	}

	protected String reverseInternal(String input) {
		char[] bytes = input.toCharArray();
		for (int i = 0; i < bytes.length / 2; i++) {
			char temp = bytes[i];
			bytes[i] = bytes[bytes.length - 1 - i];
			bytes[bytes.length - 1 - i] = temp;
		}
		return String.valueOf(bytes);
	}
}

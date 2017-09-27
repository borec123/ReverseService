package cz.borec.reverseRESTService.service;

import java.util.Stack;

import org.springframework.stereotype.Component;

@Component
public class MyReverseService extends ReverseService {

	@Override
	protected String reverseInternal(String input) {
		return stackReverseString(input);
	}
	
	public String myReverseString(String input) {
		char[] chars = input.toCharArray();
		int len = chars.length;
		char temp;

		for (int i = 0; i < input.length() / 2; i++, len--) {
			temp = chars[i];
			chars[i] = chars[len - 1];
			chars[len - 1] = temp;
		}
		return new String(chars);

	}
	
	public String stackReverseString(String s) {
	    Stack<Character> stack = new Stack<Character>();
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < s.length(); i++) {
	        stack.push(s.charAt(i));
	    }
	    while (!stack.empty()) {
	        sb.append(stack.pop());
	    }
	    return sb.toString();

	}

}

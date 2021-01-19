package cz.borec.reverseRESTService.service;

import java.util.PrimitiveIterator.OfInt;
import java.util.stream.IntStream;

import org.springframework.stereotype.Component;

@Component
public class FirstDuplicate {

	public int uniqueChars(String s) {


		char[] bytes = s.toCharArray();
		int max = 0;
		for (int i = 0; i < bytes.length; i++) {
			String ss = s.substring(i);
			int length = length(ss);
			System.out.println(ss + " - " + length);
			if(length > max) {
				max = length;
			}
		}
		

		return max;
	}
	
	public int length(String s) {


		char[] bytes = s.toCharArray();
		for (int i = 0; i < bytes.length; i++) {
			char a = s.charAt(i);
			if(s.indexOf(a) != i) {
				return i;
			}		
			
		}
		

		return s.length();
	}
	
}

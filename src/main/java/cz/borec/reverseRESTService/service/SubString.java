package cz.borec.reverseRESTService.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class SubString {

	/**
	 * getUniqueCharacterSubstring - uses sliding window
	 */
    public Set<String> getUniqueCharacterSubstring(String input) {
        Map<Character, Integer> visited = new HashMap<>();
        Set<String> otherWordsOfTheSameLength = new HashSet<>();
        String output = "";
        for (int start = 0, end = 0; end < input.length(); end++) {
            char currChar = input.charAt(end);
            if (visited.containsKey(currChar)) {
                start = Math.max(visited.get(currChar)+1, start);
            }
            if (output.length() < end - start + 1) {
                output = input.substring(start, end + 1);
                otherWordsOfTheSameLength.clear();
            }
            else if (output.length() == end - start + 1) {
            	otherWordsOfTheSameLength.add(input.substring(start, end + 1));
            	System.out.println(String.format("Both: {%s} and {%s}", output, input.substring(start, end + 1)));
            }
            visited.put(currChar, end);
        }
        otherWordsOfTheSameLength.forEach(a -> System.out.println(a));
        otherWordsOfTheSameLength.add(output);
        return otherWordsOfTheSameLength;
    }
    
    public static void main(String[] args) {
        String input = "substringfindout";
        System.out.println(new SubString().getUniqueCharacterSubstring(input));
    }
    
    
}

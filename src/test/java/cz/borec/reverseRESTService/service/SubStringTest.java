package cz.borec.reverseRESTService.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubStringTest {

	@Test
	public void givenString_whenGetUniqueCharacterSubstringCalled_thenResultFoundAsExpected() {
		SubString s = new SubString();
	    assertEquals("", s.getUniqueCharacterSubstring(""));
	    assertEquals("A", s.getUniqueCharacterSubstring("A"));
	    assertEquals("ABCDEF", s.getUniqueCharacterSubstring("AABCDEF"));
	    assertEquals("ABCDEF", s.getUniqueCharacterSubstring("ABCDEFF"));
	    assertEquals("NGISAWE", s.getUniqueCharacterSubstring("CODINGISAWESOME"));
	    assertEquals("be coding", s.getUniqueCharacterSubstring("always be coding"));
	    assertEquals("be coding", s.getUniqueCharacterSubstring("always be codin"));
	    assertEquals("ubstringf", s.getUniqueCharacterSubstring("substringfindout"));
	}

}

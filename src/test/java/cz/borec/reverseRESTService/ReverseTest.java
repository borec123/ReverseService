package cz.borec.reverseRESTService;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cz.borec.reverseRESTService.service.ReverseServiceInterface;
import cz.borec.reverseRESTService.service.ReverseService1;

public class ReverseTest extends ReverseTestBase {

	protected ReverseServiceInterface getInstance() {
		if(instance == null) {
			instance = new ReverseService1();
		}
		return instance;
	}
	@Test
	public void testReverse1() {
		assertEquals("?šÁm es kaj ,joha", test("Ahoj, jak se máš?"));
	}
	
	@Test
	public void testReverse2() {
		assertEquals(".NjaF iM ej", test("Je mi fajn."));
	}
	
	@Test
	public void testReverse3() {
		assertEquals("! ňůk ýKČuoťulž !", test("!   Žluťoučký kůň  !"));
	}
	
	@Test
	public void testReverse4() {
		assertEquals("", test(""));
	}
	
	@Test
	public void testReverse5() {
		assertEquals(" ", test(" "));
	}
	
	@Test
	public void testReverse6() {
		assertEquals(" ", test("  "));
	}
	
	@Test
	public void testReverse7() {
		assertEquals(" A ", test(" a "));
	}
	
	@Test
	public void testReverse8() {
		assertEquals(" a ", test(" a  "));
	}
	
	@Test
	public void testReverse9() {
		assertEquals(null, test(null));
	}
	
	@Test
	public void testReverse10() {
		assertEquals(" ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha", test("Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? "));
	}
	
	@Test
	public void testReverse11() {
		assertEquals(" ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha ?Šám eS kaJ ,joha", test("Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? Ahoj, jak se máš? "));
		
		
	}

	@Test
	public void testReverse12() {
		assertEquals("a", test("A"));
	}
	

}

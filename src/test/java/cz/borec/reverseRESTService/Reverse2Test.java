package cz.borec.reverseRESTService;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cz.borec.reverseRESTService.service.ReverseServiceInterface;
import cz.borec.reverseRESTService.service.ReverseService2;

public class Reverse2Test extends ReverseTestBase {

	protected ReverseServiceInterface getInstance() {
		if(instance == null) {
			instance = new ReverseService2();
		}
		return instance;
	}
	
	@Test
	public void testReverse1() {
		assertEquals("nohÁ", test("Áhon"));
	}

	@Test
	public void testReverse2() {
		assertEquals("Čapek", test("kepaČ"));
	}

	@Test
	public void testReverse3() {
		assertEquals("? šám as oka ,šírovoh oČ", test("Čo hovoríš, ako sa máš ?"));
	}

}

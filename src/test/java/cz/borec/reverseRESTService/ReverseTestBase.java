package cz.borec.reverseRESTService;

import cz.borec.reverseRESTService.service.ReverseServiceInterface;

public abstract class ReverseTestBase {

	protected ReverseServiceInterface instance;

	protected String test(String string) {
		long start = System.nanoTime();
		String result = getInstance().reverse(string);
		long end = System.nanoTime();
		System.out.println(result);

		System.out.println("Time: " + (end - start) / 1000000.0 + " ms");
		return result;
	}

	protected abstract ReverseServiceInterface getInstance();
}


package com.web.testng;

import org.testng.annotations.Test;

public class TestNg {

	@Test(priority = 1)
	public void a() {
		System.out.println("A method");
	}

	@Test(priority = -2)
	public void b() {
		System.out.println("B method");
	}

	@Test(priority = 0)
	public void c() {
		System.out.println("C method");
	}

	@Test(priority = 2)
	public void d() {
		System.out.println("D method");
	}

}

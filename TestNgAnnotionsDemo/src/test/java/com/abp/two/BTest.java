package com.abp.two;

import org.testng.annotations.Test;

public class BTest {
	@Test
	public void a() {
		System.out.println("B class a test");
	}

	@Test
	public void b() {
		System.out.println("B class b test");
	}

	@Test(groups = { "functionalTest" })
	public void c() {
		System.out.println("B class c test");
	}

	@Test(groups = { "functionalTest2" })
	public void d() {
		System.out.println("B class d test");
	}

	@Test
	public void e() {
		System.out.println("B class e test");
	}

	@Test
	public void f() {
		System.out.println("B class f test");
	}
}

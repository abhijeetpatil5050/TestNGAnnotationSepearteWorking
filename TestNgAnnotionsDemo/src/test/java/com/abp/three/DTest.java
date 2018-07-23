package com.abp.three;

import org.testng.annotations.Test;

public class DTest {
	@Test
	public void a() {
		System.out.println("D class a test");
	}

	@Test
	public void b() {
		System.out.println("D class b test");
	}

	@Test
	public void c() {
		System.out.println("D class c test");
	}

	@Test(groups = { "functionalTest" })
	public void d() {
		System.out.println("D class d test");
	}

	@Test(groups = { "functionalTest2" })
	public void e() {
		System.out.println("D class e test");
	}

	@Test
	public void f() {
		System.out.println("D class f test");
	}
}

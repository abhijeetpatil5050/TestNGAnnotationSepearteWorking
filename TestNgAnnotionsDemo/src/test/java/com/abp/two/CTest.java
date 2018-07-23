package com.abp.two;

import org.testng.annotations.Test;

public class CTest {
	
	@Test
	public void a() {
		System.out.println("C class a test");
	}

	@Test
	public void b() {
		System.out.println("C class b test");
	}

	@Test(groups = { "functionalTest" })
	public void c() {
		System.out.println("C class c test");
	}

	@Test(groups = { "functionalTest2" })
	public void d() {
		System.out.println("C class d test");
	}

	@Test
	public void e() {
		System.out.println("C class e test");
	}

	@Test
	public void f() {
		System.out.println("C class f test");
	}
}

package com.abp.four;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FTest {
	@Test
	public void a() {
		System.out.println("F class a test");
	}

	@Test
	public void b() {
		System.out.println("F class b test");
	}

	@Test
	public void c() {
		System.out.println("F class c test");
	}

	@Test
	public void d() {
		System.out.println("F class d test");
	}

	@Test
	public void e() {
		System.out.println("F class e test");
	}

	@Test(groups = { "functionalTest" })
	public void f() {
		System.out.println("F class f test");
	}
	@AfterMethod
    public void afterMethod() {
       System.out.println("in After Method");
    }
}

package com.abp.two;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.abp.three.ETest;
public class ATest {
	 @BeforeTest						//@BeforeMethod: execute at each test annotation level and @BeforeTest: execute at each class level
	    public void beforeMethod() {
	       System.out.println("in Before Method");
	    }
	 
	    
	@Test(groups = { "functionalTest","A" })
	public void a() {
		System.out.println("A class a test");
	}

	@Test(groups = { "functionalTest" })
	public void b() {
		System.out.println("A class b test");
	}

	@Test(groups = { "A" })
	public void c() {
		System.out.println("A class c test");
	}
	/*@DataProvider(name="getData")
	 public static Object[][] getData(){
	 Object [][] data = new Object [2][2];
	 
	 data [0][0] = "FirstUid";
	 data [0][1] = "FirstPWD";
	 
	 data[1][0] = "SecondUid";
	 data[1][1] = "SecondPWD";
	 
	 return data;
	 
	 }*/
	@Test(dataProvider="getData", dataProviderClass = ETest.class)
	public void getprovider(String nm,String sn) {
		System.out.println(nm);
		System.out.println(sn);
	}
	public void d() {
		System.out.println("A class d test");
	}

	@Test(successPercentage=100)
	public void e() {
		
		System.out.println("A class e test");
	}

	@Test
	public void f() {
		System.out.println("A class f test");
	}
}

package com.abp.one;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MTest {
	
	@DataProvider(name="x")
	public Object[][] m1(){
		 System.out.println("inside m1 of package one");
		 Object [][] obj = new Object[2][2];
		 
		 obj[0][0]="first";
				 obj[0][1]="second";
						 obj[1][0]="third";
								 obj[1][1]="fourth";
		 
		 return obj;
		 
	}
	@Test(dataProvider="x")
	public void m2(String a, String b){
		System.out.println(a);
		System.out.println(b);
		System.out.println("inside m2 of package one");
	}
	
	/*public void m3(){
		System.out.println("inside m3 of package one");
	}
	
	public void m4(){
		System.out.println("inside m4 of package one");
	}
	
	public void m5(){
		System.out.println("inside m5 of package one");
	}*/

}

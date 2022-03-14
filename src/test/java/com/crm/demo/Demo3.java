package com.crm.demo;

import org.testng.annotations.Test;

public class Demo3 {
	@Test
	public void demo(String Yes)  {

	    String Hungery="Yes";
		if(Hungery=="Yes" ||Hungery=="y" ||Hungery=="Y" )  {
			System.out.println("Eat something");
		}else{
			System.out.println("Otherwise Do work");
			System.out.println("Go Hell/Heaven");
			System.out.println("I'm pavan");
		}
	}
}

package com.org.testyantra;

import org.testng.annotations.Test;

public class SearchContactTest 
{
	@Test
	   public void SearchContact()
	   {
		System.out.println("Enter the contact details to be searched");
			String name=System.getProperty("name");
		    String age=System.getProperty("age");
		    String city=System.getProperty("city");
		   
		   System.out.println(name);
		   System.out.println(age);
		   System.out.println(city);
	   }
}

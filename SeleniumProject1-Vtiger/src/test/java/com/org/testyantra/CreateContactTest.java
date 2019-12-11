package com.org.testyantra;

import org.testng.annotations.Test;

public class CreateContactTest 
{
	@Test
   public void ContactCreation()
   {
		String url=System.getProperty("url");
	   String un=System.getProperty("username");
	   String pwd=System.getProperty("password");
	   
	   System.out.println(url);
	   System.out.println(un);
	   System.out.println(pwd);
   }
}

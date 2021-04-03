package com.demo.pack;

import org.testng.annotations.Test;

public class SignupTest 
{
  @Test
   public void signup()
   {
	    String url = System.getProperty("url");
		String browser= System.getProperty("browser");
		
		System.out.println("username is : " + url);
		System.out.println("password is : " + browser);
	   System.out.println("Singup Successfully");
   }
}

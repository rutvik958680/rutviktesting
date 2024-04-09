package com.ass2;
// W.a. TestNG program to create group with testing.xml file

import org.testng.annotations.Test;

public class GroupDemo1 {
	  @Test(groups= {"cyan"})
	  public void cyan1()
	  {
		  System.out.println("this is cyan1...");
	  }
	  @Test(groups= {"cyan"})
	  public void cyan2()
	  {
		  System.out.println("this is cyan2...");
	  }
	  
	  @Test(groups= {"blue"})
	  public void blue1()
	  {
		  System.out.println("this is blue1...");
	  }
	  @Test(groups= {"blue"})
	  public void blue2()
	  {
		  System.out.println("this is blue2...");
	  }
	 
	}

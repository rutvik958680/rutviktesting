package com.ass2junit;
// W.a.junit program to handled Assert class with all method to check its
//pass or fail
//
import static org.junit.Assert.fail;

import org.junit.Test;

public class AssertClass {
@Test
	public void passtest()
	{
	System.out.println("This is the passs test");	
	}
@Test
public void failtest()
{
System.out.println("This is the fail test");	
fail();
}

	
}

package com.ass2;
//W.a. TestNG program to use parameterized demo with multiple
//parameter of Facebook login with TestNG test ng 9

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FbParameterized {
	WebDriver driver=null;
	@Test
	@Parameters({"uname","pass"})
public void test(String uname,String pass) throws InterruptedException
{
	
		System.setProperty("webdriver.chrome.driver", "D:\\selenium 10am\\chromedriver-win32\\chromedriver.exe");
		
		 driver=new ChromeDriver();//to open blank browser	
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.id("email")).sendKeys(uname);
		 Thread.sleep(2000);
		 driver.findElement(By.id("pass")).sendKeys(pass);
			Thread.sleep(4000);
		 driver.findElement(By.name("login")).click();
		 Thread.sleep(3000);
//		 driver.close();	
		
	
}
 
}

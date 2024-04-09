package com.ass2junit;
//W.a. junit program to perform test with webdriver to login process of
//facebook
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginfb {
@Test
	public void logintest()  throws InterruptedException
	{
	WebDriver driver=null;
	System.setProperty("webdriver.chrome.driver", "D:\\selenium 10am\\chromedriver-win32\\chromedriver.exe");
	
	 driver=new ChromeDriver();//to open blank browser	
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(1000);
	 driver.findElement(By.id("email")).sendKeys("ryttt");
	 Thread.sleep(2000);
	 driver.findElement(By.id("pass")).sendKeys("ttt");
		Thread.sleep(1000);
	 driver.findElement(By.name("login")).click();
	 Thread.sleep(3000);
	 driver.close();	
	
	}
}

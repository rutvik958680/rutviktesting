package com.mvn;
//W.a.maven program to create Junit with webdriver Program
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitdemo {
	WebDriver driver=null;
	@Test
	public void test() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium 10am\\chromedriver-win32\\chromedriver.exe");
	
	 driver=new ChromeDriver();//to open blank browser	
	 driver.get("https://www.google.com//");
	 Thread.sleep(2000);
	}
}

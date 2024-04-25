package com.mvn;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//.a.maven program to create TestNG with Webdriver Program
import org.testng.annotations.Test;

public class TestngDemo {
	WebDriver driver=null;
	@Test
	public void test() throws InterruptedException
	{

	System.setProperty("webdriver.chrome.driver", "D:\\selenium 10am\\chromedriver-win32\\chromedriver.exe");
	
	 driver=new ChromeDriver();//to open blank browser	
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(2000);
	
}
}
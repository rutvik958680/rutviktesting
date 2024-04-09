package com.ass2;
//W.a. TestNG program to perform test with webdriver to login processof
//facebook
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fbtestng {
	WebDriver driver=null;
	@Test
public void test() throws InterruptedException
{
	
		System.setProperty("webdriver.chrome.driver", "D:\\selenium 10am\\chromedriver-win32\\chromedriver.exe");
		
		 driver=new ChromeDriver();//to open blank browser	
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.id("email")).sendKeys("556");
		 Thread.sleep(2000);
		 driver.findElement(By.id("pass")).sendKeys("ffdd");
			Thread.sleep(4000);
		 driver.findElement(By.name("login")).click();
		 Thread.sleep(3000);
		 driver.close();	
		
	
}

}

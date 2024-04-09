package com.ass2junit;
//.a. junit program to check gmail login using with
//@before,@after,@Test
import org.junit.After;
import org.junit.Before;
//	import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class GmailLogin {

		WebDriver driver=null;
		@Before
		public void beforeLogin() throws InterruptedException
		{
				System.setProperty("webdriver.chrome.driver", "D:\\selenium 10am\\chromedriver-win32\\chromedriver.exe");
			
			 driver=new ChromeDriver();//to open blank browser	
			 driver.get("https://www.google.com/");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]")).click();
			 Thread.sleep(2000);
//			 driver.close();
		}
		@Test
		public void loginTest() throws InterruptedException
		{
			 driver.findElement(By.id("identifierId")).sendKeys("rutvik5566l.com");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.name("Passwd")).sendKeys("ryry");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
			 Thread.sleep(2000);
			 
		}
		@After
		public void afterLogin() throws InterruptedException
		{
			Thread.sleep(1000);
			System.out.println("logged in");
			driver.close();
		}
		
	}










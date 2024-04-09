package com.ass2;
// W.a. TestNG program to check gmail login using with
//@beforetest,@aftertest,@Test
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gmailtestng {

	WebDriver driver=null;
	@BeforeTest
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
	}
	@Test(priority = 0)
	public void checkname() throws InterruptedException
	{
		 driver.findElement(By.id("identifierId")).sendKeys("gg@gmail.com");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		 Thread.sleep(2000);
		
	}
	@Test(priority = 1)
	public void checkPass() throws InterruptedException
	{
		 driver.findElement(By.name("Passwd")).sendKeys("ryry");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
		 Thread.sleep(2000);
		
	}
	@AfterTest
	public void afterTest() throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("logged in");
		driver.close();
	}
	
	
}

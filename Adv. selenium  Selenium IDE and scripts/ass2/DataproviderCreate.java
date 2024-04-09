package com.ass2;
//w.a. TestNG program to create dataprovider
import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderCreate {
	WebDriver driver=null;
	@DataProvider(name="rutu")
	public Object[][] input()
	{
		return new Object[][] {{"standard_user","secret_sauce"},{"problem_user","secret_sauce"}};
	}
	@Test(dataProvider= "rutu")
	public void test(String username,String password) throws InterruptedException
	{
			System.setProperty("webdriver.chrome.driver", "D:\\selenium 10am\\chromedriver-win32\\chromedriver.exe");
		
		 driver=new ChromeDriver();//to open blank browser	
		 driver.get("https://www.saucedemo.com/");
		 Thread.sleep(2000);
	
		driver.findElement(By.id("user-name")).sendKeys(username);
		 Thread.sleep(2000);
	
		driver.findElement(By.id("password")).sendKeys(password);

		 Thread.sleep(2000);
		
		 driver.findElement(By.id("login-button")).click();
		 

		 Thread.sleep(2000);
		 if(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html"))
			{
					System.out.println("your login is pass");
					
			}
			else {
					fail("invaild");
			}

		driver.findElement(By.id("react-burger-menu-btn")).click();

		 Thread.sleep(2000);
		 driver.findElement(By.id("logout_sidebar_link")).click();

		 Thread.sleep(2000);
		 driver.close();
	}
	





}

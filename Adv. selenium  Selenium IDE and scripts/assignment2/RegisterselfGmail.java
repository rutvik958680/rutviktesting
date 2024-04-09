package com.assignment2;
// W.A.J.script to register your self in Gmail.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterselfGmail {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium 10am\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//to open blank browser
		driver.get("https://www.google.com/");
		Thread.sleep(250);
		 driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).click();
		 Thread.sleep(250);
		 driver.findElement(By.xpath("/html/body/header/div/div/div/details/summary/div[1]")).click();
		 Thread.sleep(250);
		 driver.findElement(By.xpath("/html/body/header/div/div/div/details/div/a[1]")).click();
		 Thread.sleep(250);
		 driver.findElement(By.name("firstName")).sendKeys("Rutu");
		 Thread.sleep(1000);
		 driver.findElement(By.name("lastName")).sendKeys("Shah");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"collectNameNext\"]/div/button/span")).click();
		 Thread.sleep(1000);
//		 Select month= new Select(driver.findElement(By.id("month")));
//		 month.selectByVisibleText("May");
//			Thread.sleep(1000);
		 Select mon= new Select(driver.findElement(By.id("month")));
			
			mon.selectByValue("6");
			Thread.sleep(2000);
			 driver.findElement(By.name("day")).sendKeys("21");
//			 day.selectByVisibleText("May");
				Thread.sleep(1000);
				 driver.findElement(By.name("year")).sendKeys("2000");
//				 day.selectByVisibleText("May");
//					Thread.sleep(000);
				
					Thread.sleep(1000);
					 Select gender= new Select(driver.findElement(By.id("gender")));
					 gender.selectByVisibleText("Male");
						Thread.sleep(1000);
						driver.findElement(By.xpath("//*[@id=\"birthdaygenderNext\"]/div/button/span")).click();
						 Thread.sleep(1000);
						 driver.findElement(By.xpath("//*[@id=\"selectionc4\"]")).click();
						 Thread.sleep(1000);
						 driver.findElement(By.name("Username")).sendKeys("rutvikshah45453");
						 Thread.sleep(1000);
						 driver.findElement(By.xpath("//*[@id=\"next\"]/div/button/span")).click();
						 Thread.sleep(1000);
						 driver.findElement(By.name("Passwd")).sendKeys("rutvik@ttt");
						 Thread.sleep(1000);
						 driver.findElement(By.name("PasswdAgain")).sendKeys("rutvik@ttt");
						 Thread.sleep(1000);
						 driver.findElement(By.xpath("//*[@id=\"createpasswordNext\"]/div/button/span")).click();
						 Thread.sleep(1000);
						 																				
						
//		 driver.close();
		
	
	
}}

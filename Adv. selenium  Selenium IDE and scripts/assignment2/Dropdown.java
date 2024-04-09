package com.assignment2;
//W.A.J.Script To write a script for drop down.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium 10am\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//to open blank browser
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
		Select country= new Select(driver.findElement(By.name("country")));
		country.selectByIndex(1);
		Thread.sleep(2000);
		country.selectByValue("ANDORRA");
		Thread.sleep(2000);
		country.selectByVisibleText("ARMENIA");
		Thread.sleep(2000);
		driver.close();
		
		
}}

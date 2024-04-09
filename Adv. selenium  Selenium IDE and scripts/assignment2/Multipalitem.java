package com.assignment2;
//multipal Tab Select from dropdown
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multipalitem {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium 10am\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//to open blank browser
		driver.get("https://output.jsbin.com/osebed/2");
		Thread.sleep(2000);
		Select fruits= new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		Thread.sleep(1000);
		fruits.selectByValue("orange");
		Thread.sleep(1000);
		fruits.selectByIndex(3);
		Thread.sleep(1000);
		

}

}
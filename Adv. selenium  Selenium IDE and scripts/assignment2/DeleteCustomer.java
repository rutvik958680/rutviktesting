package com.assignment2;
//W.A.J. Script How to handled Alert in selenium

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCustomer {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium 10am\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//to open blank browser
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(1000);
		driver.findElement(By.name("cusid")).sendKeys("rutvik");
		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		Alert a1=driver.switchTo().alert();
		a1.accept();
		Thread.sleep(2000);
		Alert a2=driver.switchTo().alert();
		a2.accept();
		Thread.sleep(2000);
		driver.close();
		

}

}
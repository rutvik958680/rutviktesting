package com.assignment2;
//Locating by partialDemo
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingpartialDemo {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium 10am\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//to open blank browser
		driver.get("C:\\Users\\RUTVIK\\eclipse-workspace\\Seleniumn_10am\\src\\com\\assignment2\\NewFile3.html");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Here")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/a[2]")).click();
		Thread.sleep(2000);
		driver.close();
 }
}

package com.assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogo {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium 10am\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//to open blank browser
		driver.get("https://www.facebook.com/login/identify?ctx=recover");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();					

			
		if (driver.getTitle().equals("Facebook - log in or sign up")) {							
        System.out.println("We are back at Facebook's homepage");					
    } else {			
        System.out.println("We are NOT in Facebook's homepage");					
    }		
			driver.close();	
}
}
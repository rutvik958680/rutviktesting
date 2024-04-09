package com.assignment2;
//mouse hour
//W.A.J.Script To use Mouse and Keyboard event using Action class
//1.Mouse Hover Event

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium 10am\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//to open blank browser
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);
		WebElement home=driver.findElement(By.linkText("Home"));
		WebElement car=driver.findElement(By.linkText("Car Rentals"));
		WebElement vacations=driver.findElement(By.linkText("Vacations"));
	
			Actions actions=new Actions(driver);
			Action a1=actions.moveToElement(home).build();
			a1.perform();
			Thread.sleep(2000);
			Action a2=actions.moveToElement(car).build();
			a2.perform();
			Thread.sleep(2000);
			Action a3=actions.moveToElement(vacations).build();
			a3.perform();
			Thread.sleep(2000);
			driver.close();
			
	
}
}

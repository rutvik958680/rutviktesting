package com.assignment2;
//Keyboard event
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardevent {

	
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium 10am\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//to open blank browser
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement email=driver.findElement(By.id("email"));
		Actions actions=new Actions(driver);
		Action a1=actions.moveToElement(email)
				.click()
				.keyDown(email, Keys.SHIFT)
				.sendKeys(email, "rutvik")
				.keyUp(email, Keys.SHIFT)
				.doubleClick()
				.contextClick()
				.build();
		a1.perform();
}
}
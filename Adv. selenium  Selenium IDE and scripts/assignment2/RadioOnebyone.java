package com.assignment2;
//radio one by one
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioOnebyone {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium 10am\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//to open blank browser
		driver.get("https://demo.guru99.com/test/radio.html");
		Thread.sleep(2000);
for(int i=1;i<=3;i++)
{
	driver.findElement(By.cssSelector("input[value=\"Option "+i+"\"]")).click();
	Thread.sleep(2000);
	
}
driver.close();
}

}

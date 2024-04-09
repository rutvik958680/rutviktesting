package com.assignment2;
// W.A.J. Script To find the total hyperlink from this web page
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtableelement {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium 10am\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//to open blank browser
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(3000);
	
		String tname=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td[1]/a")).getText();
//		System.out.println("Total TR is..."+tname);
//		List<WebElement> th=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
//		System.out.println("Total th is..."+th.size());
		List<WebElement> tr=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]/a"));
		System.out.println("Total tr is..."+tr.size());
		for(int i=1;i<=tr.size();i++)                                           //*[@id="leftcontainer"]/table/tbody/tr[2]/td[1]/a
		{
			
				String value=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td[1]")).getText();
				System.out.println(value+" ");
				Thread.sleep(150);
			
//			System.out.println();
		}
		Thread.sleep(2000);
		driver.close();

		
}
}
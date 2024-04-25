package com.ass8;
//-given below keyword which you get from the Excel and check into youwebsite
import static org.testng.Assert.fail;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class KeybordDemo {

	@DataProvider(name="rutvik")
	public Object[][] readExcel() throws InvalidFormatException, IOException 
	{
		Object[][] data=null;
		String filepath="D:\\selenium 10am\\loginnew.xlsx";
		File file=new File(filepath);
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		Sheet sheet=workbook.getSheet("Sheet2"); 
		int nrow=sheet.getPhysicalNumberOfRows();
		System.out.println("total no of rows are..."+nrow);
		data=new Object[nrow][];
		for(int i=0;i<nrow;i++)
		{
			Row row=sheet.getRow(i);
			int ncols=row.getPhysicalNumberOfCells();
			System.out.println("total cols are..."+ncols);
			
			data[i]=new Object[ncols];
			for(int j=0;j<ncols;j++)
			{
				Cell cell=row.getCell(j);
				cell.setCellType(CellType.STRING);
				data[i][j]=cell.getStringCellValue();
				
			}
		}
		return data;
		
		
	}
	
	WebDriver driver=null;
//	private Object keyword;
	
	
	@Test(dataProvider="rutvik")
	public void test(String keyword) throws InterruptedException, InvalidFormatException, IOException
	{
			System.setProperty("webdriver.chrome.driver", "D:\\selenium 10am\\chromedriver-win32\\chromedriver.exe");
		
		
		 
			
			if(keyword.equals("open browser")) {
			driver=new ChromeDriver();//to open blank browser	
			}
			else if(keyword.equals("enter url"))
			{
			
			driver.get("http://www.automationpractice.pl/index.php");
			
		 
			Thread.sleep(2000);
			}
			else if(keyword.equals("click signin"))
			{
				driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
			}
			else if(keyword.equals("enter email"))

		 {
	
	
		driver.findElement(By.id("email")).sendKeys("rahul@gmail.com");
		 Thread.sleep(2000);
		 }
			else if(keyword.equals("enter password"))

			 {
			
		driver.findElement(By.id("passwd")).sendKeys("rahul");

		 Thread.sleep(2000);
			 }
			else if(keyword.equals("click login"))

			 {
			
		 driver.findElement(By.id("SubmitLogin")).click();
		 

		 Thread.sleep(2000);
		 
		 if(driver.getCurrentUrl().equals("http://www.automationpractice.pl/index.php?controller=authentication"))
			{
					
					fail("invaild");
			}
			
			 }
			
			else if(keyword.equals("close browser"))

			 {
		 driver.close();
		}
		}
}

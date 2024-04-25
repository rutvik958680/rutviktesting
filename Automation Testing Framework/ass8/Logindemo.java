package com.ass8;
//-to get value from the excel and check into your website
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
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Logindemo {

	@Test
	public String[][] readExcel() throws InvalidFormatException, IOException 
	{
		String[][] data=null;
		String filepath="D:\\selenium 10am\\loginnew.xlsx";
		File file=new File(filepath);
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		Sheet sheet=workbook.getSheet("Sheet1"); 
		int nrow=sheet.getPhysicalNumberOfRows();
		System.out.println("total no of rows are..."+nrow);
		data=new String[nrow][];
		for(int i=0;i<nrow;i++)
		{
			Row row=sheet.getRow(i);
			int ncols=row.getPhysicalNumberOfCells();
			System.out.println("total cols are..."+ncols);
			
			data[i]=new String[ncols];
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
	
	
	@Test
	public void test() throws InterruptedException, InvalidFormatException, IOException
	{
			System.setProperty("webdriver.chrome.driver", "D:\\selenium 10am\\chromedriver-win32\\chromedriver.exe");
		String[][] data=readExcel();
		for(int i=0;i<data.length;i++)
		{
		 
			
			driver=new ChromeDriver();//to open blank browser	
		 driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
		 Thread.sleep(2000);
	
		driver.findElement(By.id("email")).sendKeys(data[i][0]);
		 Thread.sleep(2000);
	
		driver.findElement(By.id("passwd")).sendKeys(data[i][1]);

		 Thread.sleep(2000);
		
		 driver.findElement(By.id("SubmitLogin")).click();
		 

		 Thread.sleep(2000);
		 if(driver.getCurrentUrl().equals("http://www.automationpractice.pl/index.php?controller=authentication"))
			{
					fail("INvalid");
			}
		
		}
		}
		
	
}

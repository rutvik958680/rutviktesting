package com.ass8;
//-given below keyword and Data both which you get from the Excel andcheck into you
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

public class KeybordandData {

	@DataProvider(name="rut")
	public Object[][] readExcel() throws InvalidFormatException, IOException 
	{
		Object[][] data=null;
		String filepath="D:\\selenium 10am\\loginnew.xlsx";
		File file=new File(filepath);
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		Sheet sheet=workbook.getSheet("Sheet3"); 
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

	@Test(dataProvider="rut")
	public void test(String keyword,String data) throws InterruptedException, InvalidFormatException, IOException
	{
			System.setProperty("webdriver.chrome.driver", "D:\\selenium 10am\\chromedriver-win32\\chromedriver.exe");
		
		
		 
			
			if(keyword.equals("open browser")) {
			driver=new ChromeDriver();//to open blank browser	
			}
			else if(keyword.equals("enter url"))
			{
			
			driver.get(data);
			
		 
			Thread.sleep(2000);
			}
			else if(keyword.equals("click signin"))
			{
				driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
			}
			else if(keyword.equals("enter email"))

		 {
	
	
		driver.findElement(By.id("email")).sendKeys(data);
		 Thread.sleep(2000);
		 }
			else if(keyword.equals("enter password"))

			 {
			
		driver.findElement(By.id("passwd")).sendKeys(data);

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
	



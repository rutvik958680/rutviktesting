package com.ass2junit;
//W.a. junit program to use parameterized demo with multiple
//parameter of Facebook login in junit.
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Parameterized.class)
public class FbParametrized {
    
    private String username;
    private String password;

    
    public FbParametrized(String username, String password) {
        this.username = username;
        this.password = password;

    }
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {"user1", "pass1"},
            
          });
    }
    
    @Test
    public void testLogin() throws InterruptedException {
        
        boolean actualLoginResult = facebookLogin(username, password);
        
     
        equals(actualLoginResult);
    }
    
 
    private boolean facebookLogin(String username, String password) throws InterruptedException  {
    	WebDriver driver=null;
    	System.setProperty("webdriver.chrome.driver", "D:\\selenium 10am\\chromedriver-win32\\chromedriver.exe");
    	
    	 driver=new ChromeDriver();//to open blank browser	
    	 driver.get("https://www.facebook.com/");
    	 Thread.sleep(1000);
    	 driver.findElement(By.id("email")).sendKeys("88233");
    	 Thread.sleep(2000);
    	 driver.findElement(By.id("pass")).sendKeys("fsggsf");
    		Thread.sleep(1000);
    	 driver.findElement(By.name("login")).click();
    	 Thread.sleep(3000);
//    	 driver.close();	
        return username.equals("user1") && password.equals("pass1");
    }
}
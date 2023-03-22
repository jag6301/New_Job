package test_ng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import dot_properties_file.BBBB;

public class Priority_Keyword {
	
	// BY USING PRIORITY KEYWORD WE CAN DEFINE SEQUENCE OF EXECUTION
	
	WebDriver driver;
	@Test(priority = 1)
	public void intbrowse()
	{
		System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"\\Browser\\chromedriver.exe");
		
        ChromeOptions ch = new ChromeOptions();
	
	    ch.addArguments("--remote-allow-origins=*");
	
        driver = new ChromeDriver(ch);
	
	    driver.manage().window().maximize();
	}
	@Test(priority = 2)
	public void validatelogin() throws InterruptedException, IOException
	{
		  driver.get(BBBB.prop("URL"));
		    
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//*[@name='username']")).sendKeys(BBBB.prop("USERNAME"));
		    
		    driver.findElement(By.xpath("//*[@name='password']")).sendKeys(BBBB.prop("PASSWORD"));
		    
		    driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
	@Test(priority = 3)
	public void enabledcheckbox()
	{
		 driver.findElement(By.xpath("//*[text()='Admin']")).click();
		 
		  for(int i=2;i<=30;i++)
		    {
		    	if(i%2==0)
		    	{
		    	WebElement bbb = driver.findElement(By.xpath("(//*[@class='oxd-icon bi-check oxd-checkbox-input-icon'])["+i+"]"));
		        bbb.click();
		    	}
		    }
	}

}

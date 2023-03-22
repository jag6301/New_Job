package test_ng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import dot_properties_file.BBBB;

public class Real_Test_Class_2 {
	
	@Test
	public void validatelogin(WebDriver driver) throws InterruptedException, IOException
	{
		 
		    
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//*[@name='username']")).sendKeys(BBBB.prop("USERNAME"));
		    
		    driver.findElement(By.xpath("//*[@name='password']")).sendKeys(BBBB.prop("PASSWORD"));
		    
		    driver.findElement(By.xpath("//*[@type='submit']")).click();
	}


}

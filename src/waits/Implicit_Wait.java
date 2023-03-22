package waits;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import dot_properties_file.BBBB;
import screenshot.Take;

public class Implicit_Wait {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		
	System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"\\Browser\\chromedriver.exe");
		
            ChromeOptions ch = new ChromeOptions();
		
		    ch.addArguments("--remote-allow-origins=*");
		
	        driver = new ChromeDriver(ch);
		
		    driver.manage().window().maximize();
		    
		    driver.get(BBBB.prop("URL"));
		    
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); //IMPLICIT WAIT
		    
		    driver.findElement(By.xpath("//*[@name='username']")).sendKeys(BBBB.prop("USERNAME"));
		    
		    driver.findElement(By.xpath("//*[@name='password']")).sendKeys(BBBB.prop("PASSWORD"));
		    
		    driver.findElement(By.xpath("//*[@type='submit']")).click();
		    
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    
		    driver.findElement(By.xpath("//*[text()='Admin']")).click();
		    
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    
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

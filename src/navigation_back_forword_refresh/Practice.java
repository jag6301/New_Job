package navigation_back_forword_refresh;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.interactions.Actions;


public class Practice {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"\\Browser\\chromedriver.exe");

        ChromeOptions ch = new ChromeOptions();
		
		ch.addArguments("--remote-allow-origins=*");
		
	    driver = new ChromeDriver(ch);
    
    driver.get("https://www.google.com/");
    
	driver.manage().window().maximize();
    
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    
    driver.findElement(By.xpath("//*[@name='q']")).sendKeys("selenium");
    
   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  
   List<WebElement> aaa = driver.findElements(By.xpath("//*[@class='pcTkSc']//*[text()='selenium']"));
    
   for(WebElement bbb:aaa)
    {
    	String ccc = bbb.getText();
    	System.out.println(ccc);
    	Thread.sleep(3000);
    	
    	if(ccc.equalsIgnoreCase("selenium java"))
    	{
    		bbb.click();
    	}
      }
   Thread.sleep(2000);
   
    driver.navigate().back();
    
    driver.navigate().forward();
    
    driver.navigate().refresh();
   
    
    
    
		
		
		
	}

}

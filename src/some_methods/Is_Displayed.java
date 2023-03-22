package some_methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Is_Displayed {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"\\Browser\\chromedriver.exe");
		
            ChromeOptions ch = new ChromeOptions();
		
		    ch.addArguments("--remote-allow-origins=*");
		
	        driver = new ChromeDriver(ch);
		
		    driver.manage().window().maximize();
		    
		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		    
		    driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		    
		    driver.findElement(By.xpath("//*[@type='submit']")).click();
		    
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    
		    driver.findElement(By.xpath("//*[text()='Admin']")).click();
		    
		    //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    
		   // driver.findElement(By.xpath("(//*[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[10]")).click();
		
		    
		    	WebElement bbb = driver.findElement(By.xpath("(//*[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[10]"));
		        bbb.click();
		        
		        boolean ccc = bbb.isDisplayed();
		        
		        System.out.println(ccc);
		   		
}

}

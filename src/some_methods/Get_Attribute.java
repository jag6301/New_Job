package some_methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Get_Attribute {
	
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
		    
		    WebElement aaa = driver.findElement(By.xpath("//*[@name='password']"));
		    
		    aaa.sendKeys("admin123");
		    
		    String ccc = aaa.getAttribute("value");
		    
		    System.out.println(ccc);
		    
		    driver.findElement(By.xpath("//*[@type='submit']")).click();
		    
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    
		    driver.findElement(By.xpath("//*[text()='Admin']")).click();
		    
		    //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		    
		   // driver.findElement(By.xpath("(//*[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[10]")).click();
		
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

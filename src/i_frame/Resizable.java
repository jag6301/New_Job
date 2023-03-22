package i_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Resizable {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		  System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"\\Browser\\chromedriver.exe");
			
	        ChromeOptions ch = new ChromeOptions();
		
		    ch.addArguments("--remote-allow-origins=*");
		
	        driver = new ChromeDriver(ch);
		
		    driver.manage().window().maximize();
		    
		    driver.get("https://jqueryui.com/resizable/");
		    
		    WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		    
		    driver.switchTo().frame(iframe);
		    
		    WebElement cornerarrow = driver.findElement(By.xpath("//*[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		    
		   
		    
		    Actions act = new Actions(driver);
		    
		    act.clickAndHold(cornerarrow).moveByOffset(50,60).release(cornerarrow).build().perform();
		    
	}


}

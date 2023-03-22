package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Copy_And_Paste {
	static WebDriver driver;
	public static void main(String[] args) {
		
        System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"\\Browser\\chromedriver.exe");
		
        ChromeOptions ch = new ChromeOptions();
	
	    ch.addArguments("--remote-allow-origins=*");
	
        driver = new ChromeDriver(ch);
	
	    driver.manage().window().maximize();
	    
        driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Rakesh");
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL).sendKeys("A").sendKeys("C").keyUp(Keys.CONTROL)
		.sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
		
	}

}

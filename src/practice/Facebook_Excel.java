package practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import excel.ReadData;

public class Facebook_Excel {
	
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
        System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"\\Browser\\chromedriver.exe");
		
        ChromeOptions ch = new ChromeOptions();
	
	    ch.addArguments("--remote-allow-origins=*");
	
        driver = new ChromeDriver(ch);
	
	    driver.manage().window().maximize();
	    
        driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		
		driver.findElement(By.xpath("//*[@name='firstname']")).click();
		
		Actions act = new Actions(driver);
		
	    act.sendKeys(ReadData.read(6,0)).sendKeys(Keys.TAB).sendKeys(ReadData.read(6,1)).sendKeys(Keys.TAB)
	    .sendKeys("9637011508").build().perform();
		
	}

}

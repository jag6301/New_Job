package pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Child_Browser_Pop_Up {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"\\Browser\\chromedriver.exe");
		
        ChromeOptions ch = new ChromeOptions();
	
	    ch.addArguments("--remote-allow-origins=*");
	
        driver = new ChromeDriver(ch);
	
	    driver.manage().window().maximize();
	    
	    driver.get("https://groww.in/");
	    
	    driver.findElement(By.xpath("//*[text()='Login/Register']")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//*[@class='rodal-close']")).click();
	    
	    
	    
	    
	    
	}

}

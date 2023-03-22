package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {
	
	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		
        System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"\\Browser\\chromedriver.exe");
		
        ChromeOptions ch = new ChromeOptions();
		
		ch.addArguments("--remote-allow-origins=*");
		
	    driver = new ChromeDriver(ch);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		
		Thread.sleep(2000);
		
	    TakesScreenshot scrshot = (TakesScreenshot)driver;
	    
	    File scr = scrshot.getScreenshotAs(OutputType.FILE);
	    
	   // String path = "D:\\New folder\\ok.png";
	    
	    String path = System.getProperty("user.dir")+"\\Storage\\facebook.png";
	    
	    File aaa = new File(path);
	    
	    org.openqa.selenium.io.FileHandler.copy(scr,aaa);
	}

}

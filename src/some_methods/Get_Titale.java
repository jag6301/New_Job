package some_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Get_Titale {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"\\Browser\\chromedriver.exe");
		
        ChromeOptions ch = new ChromeOptions();
	
	    ch.addArguments("--remote-allow-origins=*");
	
        driver = new ChromeDriver(ch);
	
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.phonepe.com/");
	    
	    driver.findElement(By.xpath("(//*[text()='About Us'])[1]")).click();
	    
	    String aaa = driver.getTitle();
	    
	    System.out.println(aaa);
	    
	}

}

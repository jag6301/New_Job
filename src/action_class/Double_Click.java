package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
        System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"\\Browser\\chromedriver.exe");
		
        ChromeOptions ch = new ChromeOptions();
	
	    ch.addArguments("--remote-allow-origins=*");
	
        driver = new ChromeDriver(ch);
	
	    driver.manage().window().maximize();
		
	    driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	    
	    WebElement aaa = driver.findElement(By.xpath("//*[@id='double-click']"));
	    
	    Actions act = new Actions(driver);
	    
	    act.doubleClick(aaa).build().perform();
		
	}

}

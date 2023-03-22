package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Scroll_To_Element {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"\\Browser\\chromedriver.exe");
		
        ChromeOptions ch = new ChromeOptions();
	
	    ch.addArguments("--remote-allow-origins=*");
	
        driver = new ChromeDriver(ch);
	
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.phonepe.com/");
	    
	    WebElement bbb = driver.findElement(By.xpath("//*[text()='Partner with us']"));
	    
	    Actions act = new Actions(driver);
	    
	    act.scrollToElement(bbb).build().perform();
	    
	    String aaa = driver.getTitle();
	    
	    System.out.println(aaa);
	    
	}



}

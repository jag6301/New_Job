package i_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		  System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"\\Browser\\chromedriver.exe");
			
	        ChromeOptions ch = new ChromeOptions();
		
		    ch.addArguments("--remote-allow-origins=*");
		
	        driver = new ChromeDriver(ch);
		
		    driver.manage().window().maximize();
		    
		    driver.get("https://jqueryui.com/droppable/");
		    
		    WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		    
		    driver.switchTo().frame(iframe);
		    
		    WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
		    
		    WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']"));
		    
		    Actions act = new Actions(driver);
		    
		    act.dragAndDrop(drag,drop).build().perform();
		    
		    //act.dragAndDropBy(drop,100,200);

		    
		    
		    
	}

}

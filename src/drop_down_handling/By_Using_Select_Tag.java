package drop_down_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class By_Using_Select_Tag {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
        System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"\\Browser\\chromedriver.exe");
		
        ChromeOptions ch = new ChromeOptions();
		
		ch.addArguments("--remote-allow-origins=*");
		
	    driver = new ChromeDriver(ch);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		
		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		
		Select selectbyday = new Select(day);
		
		selectbyday.selectByVisibleText("4");
		
        WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		
		Select selectmonth = new Select(month);
		
		selectmonth.selectByValue("11");
		
        WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
		
		Select selectyear = new Select(year);
		
		selectyear.selectByIndex(5);
		
		
	}

}

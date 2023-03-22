package some_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Get_Text {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
        System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"\\Browser\\chromedriver.exe");
		
        ChromeOptions ch = new ChromeOptions();
		
		ch.addArguments("--remote-allow-origins=*");
		
	    driver = new ChromeDriver(ch);
		
		driver.manage().window().maximize();
		
        driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		
		List<WebElement> aaa = driver.findElements(By.xpath("//*[@id='day']//option"));
		
		int a = 12;
		
		for(WebElement bbb:aaa)
		{
			String ccc = bbb.getText();
			System.out.println(ccc);
			if(ccc.equalsIgnoreCase("14"))
			{
				bbb.click();
			}
		}
		
		
		
		
		
	}

}

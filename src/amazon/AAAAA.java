package amazon;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AAAAA {
	static WebDriver driver;
	public static void main(String[] args) {
		
System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"\\Browser\\chromedriver.exe");
		
        ChromeOptions ch = new ChromeOptions();
		
		ch.addArguments("--remote-allow-origins=*");
		
	    driver = new ChromeDriver(ch);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("mobile");
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		driver.findElement(By.xpath("//*[text()='Redmi A1 (Light Blue, 2GB RAM, 32GB Storage) | Segment Best AI Dual Cam | 5000mAh Battery | Leather Texture Design | Android 12']")).click();
		
		String aaa = driver.getWindowHandle();
		
		System.out.println(aaa);
		
		Set<String> a = driver.getWindowHandles();
		
		int b = a.size();
		
		String[] c = new String[b];
		
		int i = 0 ;
		
		for(String d:a)
		{
			c[i]=d;
			i++;
		}
		for(String e:c)
		{
			System.out.println(e);
		}
		driver.switchTo().window(c[1]);
		
		driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();
		
	}

}

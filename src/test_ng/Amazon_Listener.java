package test_ng;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Amazon_Listener {
	
	public static WebDriver driver;
	@Test(priority = 1)
	public void navToURL() throws IOException
	{
        System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"\\Browser\\chromedriver.exe");
		
        ChromeOptions ch = new ChromeOptions();
		
		ch.addArguments("--remote-allow-origins=*");
		
	    driver = new ChromeDriver(ch);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		

	}
	@Test(priority = 2)
	public void searchTest() throws IOException, InterruptedException
	
	{
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("mobile");
		
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		driver.findElement(By.xpath("//*[text()='Oppo A78 5G (Glowing Black, 8GB RAM, 128 Storage) | 5000 mAh Battery with 33W SUPERVOOC Charger| 50MP AI Camera | 90Hz Refresh Rate | with No Cost EMI/Additional Exchange Offers']")).click();	
		
		Thread.sleep(2000);
		
		String aa = driver.getTitle();
		
		System.out.println(aa);
		
		String bb = "Groww";
		
		Assert.assertEquals(aa, bb);
		
		Thread.sleep(3000);
		
		
	
	}
	@Test(priority = 3)
	public void clickOnProductAndAdd()
	{
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
	public WebDriver getDriver() {
		// TODO Auto-generated method stub
		return null;
	}
	

}

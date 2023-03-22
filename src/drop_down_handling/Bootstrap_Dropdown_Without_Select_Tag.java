package drop_down_handling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Bootstrap_Dropdown_Without_Select_Tag {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
        System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"\\Browser\\chromedriver.exe");
		
        ChromeOptions ch = new ChromeOptions();
		
		ch.addArguments("--remote-allow-origins=*");
		
	    driver = new ChromeDriver(ch);
		
		driver.manage().window().maximize();
		
		
		
		
		
	}

}

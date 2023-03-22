package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice22 {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
    System.setProperty("WebDriver.gecko.driver",System.getProperty("user.dir")+"\\Browser\\geckodriver.exe");

    driver = new FirefoxDriver();
    
    driver.get("https://www.google.com/");
		
		
		
	}

}

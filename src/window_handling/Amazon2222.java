package window_handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon2222 {
	
	
	public void win(int k,WebDriver driver) {
		

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
		driver.switchTo().window(c[k]);
		
		
		
	}

}

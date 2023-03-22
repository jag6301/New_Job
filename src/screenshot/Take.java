package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import test_ng.Amazon_Listener;


public class Take {
	
	
	public static void getscreen(WebDriver driver,String name) throws IOException  {
		
	    TakesScreenshot aaa = (TakesScreenshot)driver;
	    
	    File scr = aaa.getScreenshotAs(OutputType.FILE);
	    
	    String path = System.getProperty("user.dir")+"\\Storage\\"+name+".png";
	    
	    File bbb = new File(path);
	    
	    FileHandler.copy(scr,bbb);
	    
	    
	}

}

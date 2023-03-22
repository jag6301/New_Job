package dot_properties_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.batik.apps.rasterizer.Main;

public class AAAA {
	
	public static void main(String[] args) throws IOException {
		
		Properties aa = new Properties();
		
		String path = System.getProperty("user.dir")+"\\fuction.properties";
		
		
		
		FileInputStream cc = new FileInputStream(path);
		
		aa.load(cc);
		
		String dd = aa.getProperty("URL");
		
		System.out.println(dd);
		
		
		
		
	}

}

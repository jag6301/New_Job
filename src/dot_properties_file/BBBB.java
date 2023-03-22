package dot_properties_file;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BBBB {
	
public static  String prop(String data) throws IOException {
		
		Properties aa = new Properties();
		
		String path = System.getProperty("user.dir")+"\\fuction.properties";
		
	    FileInputStream cc = new FileInputStream(path);
		
		aa.load(cc);
		
		String dd = aa.getProperty(data);
		
		System.out.println(dd);
		
		return dd;
		
		
		
		
	}

}

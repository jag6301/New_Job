package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	
	public static String read(int i,int j) throws IOException {
		
		String path = System.getProperty("user.dir")+"\\ExcelFile\\Test.xlsx";
		
		File aa = new File(path);
		
		FileInputStream bb = new FileInputStream(aa);
		
		XSSFWorkbook dd = new XSSFWorkbook(bb);
		
		XSSFSheet ee = dd.getSheetAt(1);// 
		
		String data = ee.getRow(i).getCell(j).getStringCellValue();
		
		System.out.println(data);
		
		return data;
		
		
	}


}

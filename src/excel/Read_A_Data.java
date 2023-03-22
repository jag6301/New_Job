package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_A_Data {
	
	public static void main(String[] args) throws IOException {
		
		String path = System.getProperty("user.dir")+"\\ExcelFile\\Test.xlsx";
		
		File aa = new File(path);
		
		FileInputStream bb = new FileInputStream(aa);
		
		XSSFWorkbook dd = new XSSFWorkbook(bb);
		
		XSSFSheet ee = dd.getSheetAt(0);// 
		
		String data = ee.getRow(4).getCell(0).getStringCellValue();
		
		System.out.println(data);
		
		
	}

}

package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_A_Data {
	
public static void main(String[] args) throws IOException {
		
		String path = System.getProperty("user.dir")+"\\ExcelFile\\Test.xlsx";
		
		File aa = new File(path);
		
		FileInputStream bb = new FileInputStream(aa);
		
		XSSFWorkbook dd = new XSSFWorkbook(bb);
		
		XSSFSheet ee = dd.getSheetAt(1);
		
		File aaa = new File(path);
				
		FileOutputStream bbb = new FileOutputStream(aaa);
		
		ee.createRow(12).createCell(3).setCellValue("ROHIT KHIRSAGAR");
		
		dd.write(bbb);
		
		
		
	}

}

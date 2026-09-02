package Resource_Testscript;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleRows {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("src\\test\\resources\\Testscript_Data.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		 Sheet sh=wb.getSheet("MultipleData");
		 
		 int rowCount = sh.getLastRowNum();
		 
		 for(int i=0;i<rowCount;i++) {
			 
			Row rw = sh.getRow(i);
			String source = rw.getCell(0).toString();//convert number,any type of data to string
			String destination=rw.getCell(1).toString();//best to use 
			//if we try to call number data from getStringcellvalue()-it give illegalStateException
			System.out.println(source+"  to  "+destination);
			
		 }
		
	}

}

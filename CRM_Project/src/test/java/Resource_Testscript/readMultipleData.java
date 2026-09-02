package Resource_Testscript;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readMultipleData {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String actualrow="";
		String expectedrow="TC_001";
		String data1="";
		String data2="";
		//check the row TC_QF_001 is available,its available read complete row data
		
		FileInputStream fis = new FileInputStream("src\\test\\resources\\Testscript_Data.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet("Organization");
		 int rowcount=sh.getLastRowNum();
		 
		 for(int i=0;i<rowcount;i++) {
			 try {//some rows are null so handle nullpointer exception by using try catch
			 actualrow = sh.getRow(i).getCell(0).toString();
			 if(actualrow.equals(expectedrow)) {
				 data1=sh.getRow(i).getCell(0).toString();
				 data2=sh.getRow(i).getCell(1).toString();
			 }
			 }catch(NullPointerException e) {
				 //System.out.println(actualrow); 
			 }
		 }
			 System.out.println(data1+" "+data2);
			 
			 
		 }
		
		
	}



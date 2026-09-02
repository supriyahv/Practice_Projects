package com.comcast.crm.generic.fileutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExeclUtility {
	
	public String getDataFromExcel(String sheetname,int rownum,int colnum) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("src\\test\\resources\\Testscript_Data.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String data=wb.getSheet(sheetname).getRow(rownum).getCell(colnum).getStringCellValue();
		//System.out.println(data);
		wb.close();
		return data;
	}
	
	public int getRowCount(String sheetname) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("src\\test\\resources\\Testscript_Data.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		int rowcount=wb.getSheet(sheetname).getLastRowNum();
		wb.close();
		return rowcount;
		
	}
	
	public void setDataIntoExcel(String sheetname,int rownum,int colnum,String data) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("src\\test\\resources\\Testscript_Data.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet(sheetname).getRow(rownum).createCell(colnum);
		
		FileOutputStream fos = new FileOutputStream("src\\test\\resources\\Testscript_Data.xlsx");
		wb.write(fos);
		wb.close();
	}

}

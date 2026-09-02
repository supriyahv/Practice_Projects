package Resource_Testscript;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSheet {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileInputStream fis = new FileInputStream("src\\test\\resources\\Testscript_Data.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
//		String data=wb.getSheet("Organization").getRow(0).getCell(0).getStringCellValue();
//		System.out.println(data);
		 double datanumeric = wb.getSheet("Organization").getRow(1).getCell(3).getNumericCellValue();
		System.out.println(datanumeric);
		long l = (long)datanumeric;//convert double to long
		System.out.println(l);
		String str=Long.toString(l);//convert long to string because sendkeys will allow only string
		System.out.println(str);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.noon.com/uae-en/");
		Thread.sleep(2000);
		driver.findElement(By.id("search-input")).sendKeys(str);
	}

}

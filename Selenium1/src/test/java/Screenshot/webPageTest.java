package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webPageTest {
	
	@Test
	public void webpageTest() throws InterruptedException, IOException {
		
		Date d = new Date();
	String timedate = d.toString().replace(':', '-');
	
	
	//String td=new Date().toString().replace(':', '-');
	
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		//Step1: Downcast
		TakesScreenshot ts = (TakesScreenshot) driver;
		//getscreenshotAs() & store screenshot  in file form
		File temp = ts.getScreenshotAs(OutputType.FILE);
		//create permanent location
		File destinationfile = new File("./Pune/pic"+timedate+".png");
		//created a folder & moved screenshot from temp location to permanent location
		FileUtils.copyFile(temp, destinationfile);
		
		
	}
}


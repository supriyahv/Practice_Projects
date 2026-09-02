package Assignment;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class watchTest {
	
	@Test
	public void myntrasTest() throws IOException, InterruptedException {
		
		String timedate=new Date().toString().replace(':', '-');
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.myntra.com/");
		
		TakesScreenshot ts = (TakesScreenshot) d;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File destinationfile = new File("./Myntra/watches"+timedate+".png");
		FileUtils.copyFile(temp, destinationfile);
		
		//indentify search tf
		WebElement searchtf = d.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
		//search watches
		searchtf.sendKeys("Watches");
		//click on enter button
		searchtf.sendKeys(Keys.ENTER);
		
		File tempwatch = ts.getScreenshotAs(OutputType.FILE);
		File destinationfilewatch = new File("./Myntra/watches"+timedate+".png");
		FileUtils.copyFile(tempwatch, destinationfilewatch);
		
		Thread.sleep(4000);
		
		d.findElement(By.xpath("//img[@alt='Carlton London Women Dial & Stainless Steel Bracelet Style Straps Analogue Watch CLSSCDGRN']")).click();
		
		File tempwatchs = ts.getScreenshotAs(OutputType.FILE);
		File destinationfilewatchs = new File("./Myntra/watches"+timedate+".png");
		FileUtils.copyFile(tempwatchs, destinationfilewatchs);
	}
	
	
}

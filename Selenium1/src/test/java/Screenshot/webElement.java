package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webElement {
	
	@Test
	public void webElementsTest() throws IOException {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.myntra.com/");
		
		//identify the webelement in the webpage
		WebElement icon = d.findElement(By.xpath("//a[@class='myntraweb-sprite desktop-logo sprites-headerLogo ']"));
		
		File temp = icon.getScreenshotAs(OutputType.FILE);
		File destinationfile = new File("./Myntraicon/icon.png");
		FileUtils.copyFile(temp, destinationfile);
	
	
	
	
	
	
	
	
	}

}

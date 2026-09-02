package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyntraTest {
	
	@Test
	public void myntrasTest() {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.myntra.com/");
		//indentify search tf
		WebElement searchtf = d.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
		//search watches
		searchtf.sendKeys("Watches");
		//click on enter button
		searchtf.sendKeys(Keys.ENTER);
		//Click on selected watch image
		d.findElement(By.cssSelector("img[alt='CASIO G-Shock GBM-2100A-1A3DR Green Analog-Digital dial Bio-Based Resin G1583']")).click();
		
	}

}

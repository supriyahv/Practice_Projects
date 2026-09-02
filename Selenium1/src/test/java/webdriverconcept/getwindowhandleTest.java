package webdriverconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getwindowhandleTest {
	
	@Test
	public void getWindowTest() {
		
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
				d.findElement(By.cssSelector("img[alt='Spiky Unisex Kids Pink Printed Dial & Pink Straps Analogue Watch']")).click();
				System.out.println(d.getWindowHandles());
	}
	
	@Test
	public void getWindowsTest() {
		
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
				d.findElement(By.cssSelector("img[alt='Spiky Kids Pack Of 2 Dial & Straps Analogue Multi Function Watch Combo_EVA19_BlkPnk']")).click();
				System.out.println(d.getWindowHandles());
	}

}

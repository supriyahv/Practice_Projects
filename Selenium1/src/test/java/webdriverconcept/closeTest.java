package webdriverconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class closeTest {
	
	@Test
	public void MyntraTest() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WebElement searchbar = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		searchbar.sendKeys("watches");
		Thread.sleep(2000);
		searchbar.sendKeys(Keys.ENTER);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//img[@title='Titan Edge Squircle Men Quartz with Glossy Ceramic Analogue Watch 1841QC04']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}

package locatorConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyntrasTest {
	
	@Test
	public void myntrawatchTest() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		//search for watches
		WebElement searchtf=driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
		searchtf.sendKeys("Watches");
		searchtf.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//label[text()='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Smart Watches']")).click();
	
	
	
	}

}

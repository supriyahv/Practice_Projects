import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javascript {
	
	@Test
	public void myntraTest() throws InterruptedException {
		

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.myntra.com/");
		//indentify search tf
		WebElement searchtf = d.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
		//search watches
		searchtf.sendKeys("Watches");
		//click on enter button
		searchtf.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		JavascriptExecutor js =(JavascriptExecutor)d;
		//js.executeScript("window.scrollBy(0,-200)");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}

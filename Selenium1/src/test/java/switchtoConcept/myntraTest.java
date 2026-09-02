package switchtoConcept;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class myntraTest {
	
	@Test
	public void addProductToCart() {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.myntra.com/");
		
		WebElement searchtf = d.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
		searchtf.sendKeys("Watches");
		searchtf.sendKeys(Keys.ENTER);
		d.findElement(By.cssSelector("img[title='Kool Kidz Kids Printed Dial & Straps Analogue Watches Koolkidz Watch KK 408 BLUE']")).click();
		
		String parentwindow = d.getWindowHandle();
		Set<String> win = d.getWindowHandles();//2 windows
		
		for(String id:win) {
			d.switchTo().window(id);
		}
		//driver control is in child window
		d.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
		
		d.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
		
		d.findElement(By.xpath("//div[text()='PLACE ORDER']")).click();
		
		d.switchTo().window(parentwindow);//driver control is in parent window
		
		d.findElement(By.cssSelector("img[title='Carlton London Women Dial & Stainless Steel Bracelet Style Straps Analogue Watch CLSSCDGRN']")).click();
	
	
	}
}

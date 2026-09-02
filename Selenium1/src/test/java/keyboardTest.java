import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class keyboardTest {
	
	@Test
	public void helloTest() throws AWTException, InterruptedException {
		
      WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.pantaloons.com/");
		

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.myntra.com/");
		//indentify search tf
		WebElement searchtf = d.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
		//search watches
		searchtf.sendKeys("Watches");
		//click on enter button
	
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		
	
		
		
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		r.mouseWheel(300);
		
	}

}

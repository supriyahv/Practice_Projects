package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class scrollingTest {
	
	@Test
	public void scrollTest() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//jse.executeScript("window.scrollBy(0,200)");
		//jse.executeScript("window.scrollTo(0,200)");
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	@Test
	public void scrollRobotTest() throws AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		Robot r = new Robot();
		//r.mouseWheel(400);
		
		WebElement searchtf = driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
		searchtf.sendKeys("watches");
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		//r.keyRelease(KeyEvent.VK_BACK_SPACE);
		
		
	}
	
	

}

package ActionsclassConcept;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Robotc_keyboard {
	
	@Test
public void promptpopup() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=1");
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//td[text()='Levis Shirt']//ancestor::tr[contains(@class,'b')]//descendant::input[@type='checkbox']")).click();
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//button[@id='deleteButton']")).click();
		
		Thread.sleep(6000);
		
		Alert alert = driver.switchTo().alert();
		
		//alert.accept();
		Thread.sleep(3000);
		
		alert.sendKeys("hello");
		
		alert.accept();
	}

}

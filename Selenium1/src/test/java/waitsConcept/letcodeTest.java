package waitsConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class letcodeTest {
	
	@Test
	public void letcodesTest() {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.myntra.com/");
		
		//Step1:
		WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(10));
		
		WebElement searchbar = d.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
		wait.until(ExpectedConditions.elementToBeClickable(searchbar));
		
		searchbar.sendKeys("watches");
	
	
	}
	
	@Test
	public void letcodeTest() {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/test");
		
		WebElement edittext = d.findElement(By.xpath("//a[text()=' Edit ']"));
		
		WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(edittext));
		edittext.click();
		d.findElement(By.id("fullName")).sendKeys("Pune");
}
	
	@Test
	public void letcodefluentTest() {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/test");
		
		WebElement text = d.findElement(By.xpath("//h1[text()='Ready to be a Pro Engineer?']"));
		WebElement edittext = d.findElement(By.xpath("//a[text()=' Edit ']"));
		
		//WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(5));
		FluentWait wait = new FluentWait(d);
		wait.pollingEvery(Duration.ofSeconds(1));//polling period
		wait.withTimeout(Duration.ofSeconds(50));//max time duration
		wait.until(ExpectedConditions.elementToBeSelected(text));
		edittext.click();
		d.findElement(By.id("fullName")).sendKeys("Pune");
}
}

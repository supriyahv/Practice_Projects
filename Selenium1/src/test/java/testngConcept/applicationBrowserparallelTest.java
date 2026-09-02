package testngConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class applicationBrowserparallelTest {

	
	@Test
	public void Zomato() {
		WebDriver  driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.zomato.com/");
			}
	
	@Test
	public void Myntra() {
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
	}
	
	@Test
	public void Swiggy() {
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
	}
	
	@Test
	public void Flipkart() {
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	}
	
	@Test
	public void Amazon() {
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}

}

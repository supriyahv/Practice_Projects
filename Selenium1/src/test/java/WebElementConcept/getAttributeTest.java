package WebElementConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getAttributeTest {
	
	@Test
	public void getAttributesTest() {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.pantaloons.com/");
		String searchtf=d.findElement(By.cssSelector("input[placeholder='Search']")).getAttribute("placeholder");
		System.out.println(searchtf);
	}
	
	@Test
	public void getCSSvalueTest() {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.pantaloons.com/");
		String searchtf=d.findElement(By.cssSelector("input[placeholder='Search']")).getCssValue("background-origin");
		System.out.println(searchtf);
	}

}



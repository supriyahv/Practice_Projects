package WebElementConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class submitTest {
	
	@Test
	public void submitTest() {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/"); 
		//d.findElement(By.name("login")).submit();
		d.findElement(By.xpath("//a[text()='Create new account']")).submit();
	}

}

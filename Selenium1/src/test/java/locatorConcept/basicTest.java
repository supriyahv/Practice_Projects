package locatorConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class basicTest {
	
	@Test
	public void basicPageTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/user183/Desktop/web.html");
		driver.findElement(By.cssSelector("input[placeholder='enter place']")).sendKeys("Pune");
	}

}

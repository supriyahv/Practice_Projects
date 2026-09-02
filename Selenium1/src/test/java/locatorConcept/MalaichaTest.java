package locatorConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MalaichaTest {
	
	@Test
	public void malaichaTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/login");
		driver.findElement(By.xpath("//button[text()='Register']")).click();
	}

}

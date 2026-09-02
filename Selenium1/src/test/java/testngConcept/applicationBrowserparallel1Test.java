package testngConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class applicationBrowserparallel1Test {
	
	@Test
	public void Tira() {
		WebDriver  driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.tirabeauty.com/");
			}

}

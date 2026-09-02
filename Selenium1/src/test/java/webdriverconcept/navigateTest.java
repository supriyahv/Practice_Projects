package webdriverconcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class navigateTest {
	
	@Test
	public void navigationTest() throws Exception {
		
		WebDriver d= new ChromeDriver();
		
		d.get("https://www.google.com/");
		
		d.navigate().back();
		
		d.navigate().forward();
		
		d.navigate().refresh();
		
		d.navigate().to("https://www.amazon.in/");
		
		d.navigate().back();
	}

}

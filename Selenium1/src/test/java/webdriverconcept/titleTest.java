package webdriverconcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class titleTest {
	
	@Test
	public void loginPageTest() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://www.myntra.com/");
		System.out.println(driver.getTitle());//get current webpage title
		driver.close();
	}
	
	@Test
	public void urlTest() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		//driver.manage().window().fullscreen();
		System.out.println(driver.manage().window().getSize());
		System.out.println(driver.getCurrentUrl());//get current webpage url
		//driver.close();
	}

}

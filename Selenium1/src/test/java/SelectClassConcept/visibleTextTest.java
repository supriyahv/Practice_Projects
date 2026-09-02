package SelectClassConcept;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class visibleTextTest {
	
	@Test
	public void selectWebElementTest() throws IOException {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/signup");

		//Identify webelement ---month dropdown
		WebElement Months = d.findElement(By.id("month"));
		
		//Create object of Select class & pass webelement as an argument
		Select s = new Select(Months);
		
		//call non static methods ,selectBy
		s.selectByVisibleText("Jun");
}
	

}

package SelectClassConcept;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultipleTest {
	
	@Test
	public void selectWebElementTest() throws IOException {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/signup");

		//Identify webelement ---month dropdown
		WebElement Months = d.findElement(By.id("month"));
		
		//Create object of Select class & pass webelement as an argument
		Select s = new Select(Months);
		
		//call non static methods
		System.out.println(s.isMultiple());//false----single list dropdown
}
	
	@Test
	public void ismultipleWebElementTest() throws IOException {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/dropdowns");

		//Identify webelement ---month dropdown
		WebElement dropdown = d.findElement(By.id("superheros"));
		
		//Create object of Select class & pass webelement as an argument
		Select s = new Select(dropdown);
		
		//call non static methods
		System.out.println(s.isMultiple());//true--multi list dropdown
}
}

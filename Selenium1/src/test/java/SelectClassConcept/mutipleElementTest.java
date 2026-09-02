package SelectClassConcept;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class mutipleElementTest {
	
	@Test
	public void IndexWebElementTest() throws IOException {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/dropdowns");

		//Identify webelement ---month dropdown
		WebElement dropdown = d.findElement(By.id("superheros"));
		
		//Create object of Select class & pass webelement as an argument
		Select s = new Select(dropdown);
		
		//call non static methods
		s.selectByIndex(0);
		s.selectByVisibleText("Aquaman");
		s.deselectByValue("am");

}
	

	@Test
	public void IndexsWebElementTest() throws IOException, InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/dropdowns");

		//Identify webelement ---month dropdown
		WebElement dropdown = d.findElement(By.id("fruits"));
		
		//Create object of Select class & pass webelement as an argument
		Select s = new Select(dropdown);
		
		//call non static methods
		List<WebElement> allnames = s.getOptions();//return multiple webelement id's
		for(WebElement fruit:allnames) {
			System.out.println(fruit.getText());//return text of webelement
		}
		
		
		

}
	
	@Test
	public void multipleWebElementTest() throws IOException {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/dropdowns");

		//Identify webelement ---
		WebElement dropdown = d.findElement(By.id("superheros"));
		
		//Create object of Select class & pass webelement as an argument
		Select s = new Select(dropdown);
		
		//call non static methods
		s.selectByVisibleText("Batman");
		s.selectByVisibleText("Aquaman");
		s.selectByVisibleText("The Avengers");
		//System.out.println(s.getAllSelectedOptions());
		List<WebElement> all = s.getAllSelectedOptions();
		for(WebElement selected:all) {
			System.out.println(selected.getText());
		}
}
	
	@Test
	public void singleWebElementTest() throws IOException, InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/dropdowns");

		//Identify webelement ---
		WebElement dropdown = d.findElement(By.id("superheros"));
		
		//Create object of Select class & pass webelement as an argument
		Select s = new Select(dropdown);
		
		s.selectByVisibleText("Batman");
		s.selectByVisibleText("Aquaman");
		s.selectByVisibleText("The Avengers");
		
		System.out.println(s.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		s.deselectAll();
		
}
	
}


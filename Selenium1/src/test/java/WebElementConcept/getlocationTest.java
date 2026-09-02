package WebElementConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getlocationTest {
	
	@Test
	public void getLocationTest() {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.pantaloons.com/");
		//identify searchtf & enter bag
		d.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("Bag");
		//click on search icon
		d.findElement(By.cssSelector("span[class='desktopHomePageSprite HeaderSearch']")).click();
		
	 Rectangle image = d.findElement(By.cssSelector("img[alt='ABG Brand Logo']")).getRect();
		System.out.println(image.getX());
		System.out.println(image.getY());
		System.out.println(image.getHeight());
		System.out.println(image.getWidth());
	}

}

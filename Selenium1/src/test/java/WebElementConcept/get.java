package WebElementConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class get {
	
	
	@Test
	public void get() {
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.myntra.com/");
		String searchtftagname = d.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).getTagName();
		System.out.println(searchtftagname);
		
		Dimension searchtfsize = d.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).getSize();
		System.out.println(searchtfsize);
		
		Point searchtflocation = d.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).getLocation();
		System.out.println(searchtflocation);
		
		 Rectangle searchtfrect = d.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).getRect();
		System.out.println(searchtfrect.getHeight());
		System.out.println(searchtfrect.getWidth());
		System.out.println(searchtfrect.getX());
		System.out.println(searchtfrect.getY());
	
	
	
	
	
	}

}

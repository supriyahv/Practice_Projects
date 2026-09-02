package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TiraTest {
	
	@Test
	public void tiraAppTest() throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tirabeauty.com");
		WebElement searchtf=d.findElement(By.id("search"));//identify searchtf
		searchtf.sendKeys("Perfumes");
		searchtf.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		d.findElement(By.cssSelector("img[alt='Jean Paul Gaultier | Jean Paul Gaultier Le Male Elixir Eau De Parfum For Men (125 ml)']")).click();
	}
	
	@Test
	public void googleTest() {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.google.com/");
		d.findElement(By.linkText("About")).click();
		
	}
	
	@Test
	public void tiraApplicationTest() {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tirabeauty.com");
		d.findElement(By.partialLinkText("Tools &")).click();

}
}

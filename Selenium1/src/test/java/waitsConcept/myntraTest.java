package waitsConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class myntraTest {
	
	@Test
	public void watchTest() throws InterruptedException {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.myntra.com/");
		d.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("Watches");
		d.findElement(By.cssSelector("span[class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		d.findElement(By.xpath("//label[text()='Men']")).click();
		//Thread.sleep(2000);
		d.findElement(By.xpath("//label[text()='Smart Watches']")).click();
		//Thread.sleep(2000);
		d.findElement(By.cssSelector("img[alt='Helix By Timex Water Resistant Smart Watches TW0HXW700T']")).click();
	
	
	}

}

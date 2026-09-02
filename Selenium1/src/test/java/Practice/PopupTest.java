package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopupTest {
	
	@Test
	public void javascriptTest() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
		driver.findElement(By.xpath("//a[text()=' Dialog ']")).click();
		driver.findElement(By.id("accept")).click();
		
		driver.switchTo().alert().accept();
	}
	
	@Test
	public void javascriptConfirmTest() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
		driver.findElement(By.xpath("//a[text()=' Dialog ']")).click();
		driver.findElement(By.id("confirm")).click();
		
		driver.switchTo().alert().dismiss();
	}
	
	@Test
	public void javascriptPromptTest() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
		driver.findElement(By.xpath("//a[text()=' Dialog ']")).click();
		driver.findElement(By.id("prompt")).click();
		
		Alert popup = driver.switchTo().alert();
	System.out.println(popup.getText());
		popup.sendKeys("Pune");
		popup.accept();
	}
	
	
	
	
	@Test
	public void authenticationpopup() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		
	}

}

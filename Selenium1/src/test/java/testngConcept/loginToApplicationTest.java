package testngConcept;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.BaseTest;

public class loginToApplicationTest extends BaseTest {//child class
	
	@Test(invocationCount=2,priority=3)
	public void loginToApplicationUsernamePasswordTest() {
		
		driver.findElement(By.xpath("//span[text()='Leave']")).click();
		
	}
	
	@Test(priority=1)
	public void clickOnPIMTest() {
		
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		
	}
	
	@Test(priority=2)
	public void timeClickTest() {
		
		driver.findElement(By.xpath("//span[text()='Time']")).click();
	}

}

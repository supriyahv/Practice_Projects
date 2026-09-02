package locatorConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class googleTest {
	
	@Test
	public void GooglePageTest() throws InterruptedException {
		
		
		
		WebDriver driver = new ChromeDriver();//Launch empty chrome browser
		driver.manage().window().maximize();//maximize the browser window
		driver.get("https://www.google.com/");//Launch the application
		//Step1: driver.findElement(null);//identify single element on webpage
		//Step2: driver.findElement(By.id("APjFqb"));//identify search text feild on webpage
		//driver.findElement(By.id("APjFqb")).click();//Step3: identify search text feild on webpage & performed click operation 
		driver.findElement(By.id("APjFqb")).sendKeys("Pune");//Step4: identify search text feild on webpage & send value
		driver.findElement(By.id("APjFqb")).clear();//Step5:identify search text feild on webpage & clear 
		
	
	}
	
	@Test
	public void GooglePagesTest() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement searchtf = driver.findElement(By.id("APjFqb"));//identify searchtf only once
		searchtf.click();//clicking on searchtf
		searchtf.sendKeys("Pune");//Enter the value on searchtf
		//searchtf.clear();//Remove the value on searchtf
		
	}
	
	
	

}

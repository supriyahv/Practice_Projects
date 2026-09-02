package ActionsclassConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mouseActionTest {
	
	@Test
	public void clickingTest() {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/test");
		
		//Identify dropdown element
		WebElement dropdown = d.findElement(By.partialLinkText("Drop-Down"));
		
		//Create object of Actions class & pass driver reference in actions constructor
		Actions a = new Actions(d);
		//call non static method
		//a.click();//click on webpage
		//a.click(dropdown);//clicking on targeted element(drop-down text)
		//call perform method
		a.perform();
	}
	

	@Test
	public void sendkeyTest() throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/test");
		
		Thread.sleep(2000);
		//Identify dropdown element
		WebElement dropdown = d.findElement(By.xpath("//a[text()=' Edit ']"));
		
		
		
		//Create object of Actions class & pass driver reference in actions constructor
		Actions a = new Actions(d);
		//a.sendKeys(Keys.PAGE_DOWN);//scrolling
		a.sendKeys(dropdown, Keys.ENTER).perform();//clicking,enter the value
		WebElement textf = d.findElement(By.id("fullName"));
		a.sendKeys(textf, "Pune").perform();

}
	@Test
	public void contextClickTest() throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/test");
		WebElement POM=d.findElement(By.partialLinkText("Page Object Model"));
		Actions a = new Actions(d);
		//a.contextClick();//right click on the webpage
		a.contextClick(POM);//right click on webelement
		a.perform();
	
}
	@Test
	public void dragdropTest() throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/droppable");
		
		Thread.sleep(2000);
		
		WebElement source=d.findElement(By.id("draggable"));
		WebElement target=d.findElement(By.id("droppable"));
		
		Actions a = new Actions(d);
		//a.dragAndDrop(source, target).perform();
		a.clickAndHold(source).moveToElement(target).release(target).perform();
	
}
	
	@Test
	public void moveToElementTest() throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.myntra.com/");
		Thread.sleep(2000);
		
		WebElement std=d.findElement(By.xpath("//a[text()='Studio']"));
		Actions a = new Actions(d);
		a.moveToElement(std).perform();
	
}
	@Test
	public void moveToElementsTest() throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.myntra.com/");
		Thread.sleep(2000);
		WebElement hm=d.findElement(By.xpath("(//a[text()='Home'])[1]"));
		Actions a = new Actions(d);
		a.moveToElement(hm, -80, 0).perform();
		
	
}
	@Test
	public void moveByOffsetTest() {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/droppable");
		
		Actions a = new Actions(d);
		a.moveByOffset(800, 0).contextClick().perform();
	
}
	
	@Test
	public void ElementTest() {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/droppable");
		Actions a = new Actions(d);
		a.moveByOffset(800, 0).contextClick().build();
		
		
	}
	
	@Test
	public void doubleClickTest() {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement button=	d.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions a = new Actions(d);
		//a.doubleClick(button).perform();
		a.doubleClick().perform();
}
}


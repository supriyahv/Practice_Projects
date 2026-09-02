package WebElementConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class enableTest {
	
	    @Test
	    public void enableTest() {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.myntra.com/");
		boolean searchtf = d.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).isEnabled();
		System.out.println(searchtf);
	
	
	}
	    
	    @Test
	    public void enablesTest() {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("file:///C:/Users/user183/Desktop/p.html");  
		boolean tf = d.findElement(By.xpath("(//input[@type='text'])[2]")).isEnabled();
		System.out.println(tf);
}
	    
	    @Test
	    public void selectedTest() {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("file:///C:/Users/user183/Desktop/p.html"); 
		boolean checkbx = d.findElement(By.cssSelector("input[type='checkbox']")).isSelected();
		System.out.println(checkbx);
		
}
	    
	    @Test
	    public void displayedTest() throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		Thread.sleep(4000);
	    boolean loginbtn = d.findElement(By.xpath("//button[text()=' Login ']")).isDisplayed();
	    System.out.println(loginbtn);
	    
	    
	    
//	    boolean restbtn = d.findElement(By.xpath("//button[text()=' Reset Password ']")).isDisplayed();
//	    System.out.println(restbtn);
}
	    
	    @Test
	    public void enabledTest() {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.actitime.com/free-online-trial"); 
		boolean btn = d.findElement(By.id("confirm-button")).isEnabled();
		System.out.println(btn);
}
}


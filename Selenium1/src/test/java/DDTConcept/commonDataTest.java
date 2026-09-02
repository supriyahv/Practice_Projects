package DDTConcept;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class commonDataTest {
	
	@Test
	public void commonTest() throws IOException {
		
		//Step1: get the phyiscal patha of property file by FileInputStream class 
		FileInputStream fis = new FileInputStream("src\\test\\resources\\Data.properties.txt");
		
		//Step2:create object of properties
		Properties p = new Properties();
		
		//Step3:call load()
		p.load(fis);
		
		//Step4:call getProperty()
		String BROWSER = p.getProperty("browser");
		String URL=p.getProperty("url");
		String USERNAME=p.getProperty("username");
		String PASSWORD=p.getProperty("password");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		driver.findElement(By.name("username")).sendKeys(USERNAME);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
	}

}

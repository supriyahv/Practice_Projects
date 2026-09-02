package BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import GenericUtility.fileUtility;
import GenericUtility.javaUtility;

public class BasePageClass {
	
	public WebDriver driver;//global variable
	public Logger logger;//global variable
	
	protected fileUtility fu = new fileUtility();
	protected javaUtility ju = new javaUtility();

	@BeforeClass
	//@Parameters("browser")
	public void setup() throws IOException {
		
		
		logger=LogManager.getLogger(this.getClass());
		
		String Browser=fu.getDataFromPropertyFile("browsername");
		String Url=fu.getDataFromPropertyFile("appUrl");
		
		if(Browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(Browser.equalsIgnoreCase("firefox")){
			driver= new FirefoxDriver();
		}else {
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(Url);
		
	}
	@AfterClass
	public void teardown() {
		driver.quit();
	}

}

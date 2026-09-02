package Base;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utils.CommonUtils;

public class BaseTest {
	
	public static WebDriver driver;//make static to inherit to other class,if it is non static variable ,we need to create object
	//WebDriver driver;
	
	
	public WebDriver openBrowserAndLaunchApplication() {
		Properties prop = CommonUtils.loadProperties();
		
		
		String Browser=prop.getProperty("browsername");
		String Url=prop.getProperty("appUrl");
		
		
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
		
		return driver;
	}
	}



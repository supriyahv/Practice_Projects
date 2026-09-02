package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch the chrome browser
		ChromeDriver d = new ChromeDriver();
		d.get("https://demoapps.qspiders.com/ui?scenario=1");
	//	SearchContext d = new ChromeDriver();//2
		
	//	JavascriptExecutor d = new ChromeDriver();//2
		
	//TakesScreenshot d = new ChromeDriver();//1
	
		//WebDriver d = new ChromeDriver();//13
		
		

	}

}

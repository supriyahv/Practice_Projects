package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportTest {
	
	@Test
	public void ReportsTest() {
			
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/test");
		
		ExtentSparkReporter esp = new ExtentSparkReporter("./Reports/letcode4.png");//To configure the  report
		esp.config().setReportName("Myntra application");//set report name
		esp.config().setTheme(Theme.DARK);//set theme of the report
		esp.config().setDocumentTitle("Myntra");//set title for the report
		
		ExtentReports rep = new ExtentReports();//generate the report
		rep.attachReporter(esp);//add configurations to report
		rep.setSystemInfo("Browser", "Chrome");//to add system envirnoment data
		rep.setSystemInfo("OS", "Windows");
		rep.setSystemInfo("Author", "Pune");
		
		
		ExtentTest test = rep.createTest("Search watches");
		
		test.log(Status.INFO, "watches page displayed");
		test.log(Status.PASS, "watches page displayed");
		test.log(Status.FAIL, "watches page displayed");
		test.log(Status.SKIP, "watches page displayed");
		
		
		rep.flush();//backup of the report
		
	}

}

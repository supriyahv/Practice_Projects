package extentReportsConcept;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class letcodeTest {
	
	public ExtentReports rep;
	
	@BeforeSuite
	public void BS() {
		ExtentSparkReporter esp = new ExtentSparkReporter("./Reports/letcodeScript.png");//To configure the  report
		esp.config().setReportName("Myntra application");//set report name
		esp.config().setTheme(Theme.DARK);//set theme of the report
		esp.config().setDocumentTitle("Myntra");//set title for the report
		
		 rep = new ExtentReports();//generate the report
		rep.attachReporter(esp);//add configurations to report
		rep.setSystemInfo("Browser", "Chrome");//to add system envirnoment data
		rep.setSystemInfo("OS", "Windows");
		rep.setSystemInfo("Author", "Pune");
	}
	
	@Test
	public void HomePage() {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/test");
		
		TakesScreenshot ts = (TakesScreenshot) d;
		String temp=ts.getScreenshotAs(OutputType.BASE64);
		
		ExtentTest test = rep.createTest("HomePage");
		test.log(Status.INFO, "Home page is displayed");
		if(d.getTitle().contains("Pune")) {
			test.log(Status.PASS, "Pune");
		}else {
			test.log(Status.FAIL, "Pune");
			test.addScreenCaptureFromBase64String(temp);
		}
	}
	
	@Test
	public void EditPage() {
		rep.createTest("EditPage");
		
	}
	
	@Test
	public void DropdownPage() {
		rep.createTest("DropdownPage");
		
	}
	
	@AfterSuite
	public void AS() {
		rep.flush();
	}

}

package extentReportsConcept;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
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

public class LetcodesTest {
	
	public ExtentReports rep;//global variable
	
	@BeforeSuite
	public void BS() {
		
		ExtentSparkReporter esp = new ExtentSparkReporter("./Reports/letcodeclass.png");//To configure the  report
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
	public void HomePageTest() {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/test");
		
		ExtentTest test = rep.createTest("HomePageTest");
	test.log(Status.INFO, "Home Page is displayed");
	
	TakesScreenshot ts = (TakesScreenshot) d;
	String temp = ts.getScreenshotAs(OutputType.BASE64);
	
	
	if(d.getTitle().contains("Pune")) {
		test.log(Status.PASS, "title contains Pune");
	}else {
		test.log(Status.FAIL, "title not contains Pune");
		//test.addScreenCaptureFromBase64String(temp);
		test.addScreenCaptureFromBase64String(temp, "image");
	}
	
	}
	
	@Test
	public void EditPageTest() {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/test");
		
		d.findElement(By.xpath("//a[text()=' Edit ']")).click();
		
		ExtentTest test = rep.createTest("EditPageTest");
		test.log(Status.INFO, "Edit Page is displayed");
	}
	
	@AfterSuite
	public void AS() {
		rep.flush();//backup of the report
	}

}

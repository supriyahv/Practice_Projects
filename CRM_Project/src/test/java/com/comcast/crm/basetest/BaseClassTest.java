package com.comcast.crm.basetest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.comcast.crm.generic.fileutility.ExeclUtility;
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.generic.objectrepositoryutility.HomePage;
import com.comcast.crm.generic.objectrepositoryutility.LoginPage;
import com.comcast.crm.generic.webdriverutility.JavaUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

public class BaseClassTest   {
	
	public WebDriver driver;

	public FileUtility fu = new FileUtility();
	public WebDriverUtility wu=new WebDriverUtility();
	public ExeclUtility eu = new ExeclUtility();
	public JavaUtility ju = new JavaUtility();
	

	  @BeforeSuite(groups= {"smokeTest","regressionTest"})
	  public void beforeSuite() {
		  
	  }
	
 
  @BeforeMethod(groups= {"smokeTest","regressionTest"})
  public void beforeMethod() throws IOException {
	  String URL = fu.getDataFromPropertyFile("url");
	  String USERNAME = fu.getDataFromPropertyFile("username");
	  String PASSWORD = fu.getDataFromPropertyFile("password");
	  
	  LoginPage lp = new LoginPage(driver);
	  lp.Login(URL,USERNAME, PASSWORD);
	  

	 
  }

  @AfterMethod(groups= {"smokeTest","regressionTest"})
  public void afterMethod() {
	  
	  HomePage hp = new HomePage(driver);
	  hp.Logout();
  }

  @Parameters("Browser")
  @BeforeClass(groups= {"smokeTest","regressionTest"})
  public void beforeClass(String browser) throws IOException {
	  
	  //String BROWSER = browser;//for cross browser parallel execution
	  String BROWSER =fu.getDataFromPropertyFile("browser");
	  
	  if(BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(BROWSER.equalsIgnoreCase("firefox")){
			driver= new FirefoxDriver();
		}else {
			driver=new EdgeDriver();
		}
	 
  }

  @AfterClass(groups= {"smokeTest","regressionTest"})
  public void afterClass() {
	  driver.quit();
  }


  @AfterSuite(groups= {"smokeTest","regressionTest"})
  public void afterSuite() {
  }

}

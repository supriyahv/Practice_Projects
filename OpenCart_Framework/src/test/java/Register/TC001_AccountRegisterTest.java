package Register;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseClass.BasePageClass;
import GenericUtility.fileUtility;
import GenericUtility.javaUtility;
import POM.HomePage;
import POM.RegisterPage;

public class TC001_AccountRegisterTest extends BasePageClass {
	
	@Test
	public void verify_account_registeration() throws IOException {
		
		String FIRSTNAME=fu.getDataFromPropertyFile("firstname");
		String LASTNAME=fu.getDataFromPropertyFile("lastname");
		String EMAIL=fu.getDataFromPropertyFile("email");
		String TELEPHONE=fu.getDataFromPropertyFile("telephone");
		String PASSWORD=fu.getDataFromPropertyFile("password");
		String CONFIRMPASSWORD=fu.getDataFromPropertyFile("confirmpassword");
		
		try {
		logger.info("*******TC001_AccountRegisterTest execution started********");
		
		HomePage hp = new HomePage(driver);
		logger.info("Clicking on Account");
		hp.clickOnMyAccount();
		logger.info("Clicking on Register");
		hp.clickRegister();
		
		logger.info("Providing customer details");
		RegisterPage rp = new RegisterPage(driver);
		rp.enterFirstName(FIRSTNAME.toUpperCase());//convert firstname to uppercase
		rp.enterlastFirstName(LASTNAME);
		rp.enterEmail(EMAIL+ju.getRadomString()+"@gmail.com");
		rp.enterTelephone(ju.getRadomNumber());//randomnumber of 10 digit
		String password=ju.getRadomAlphaNumeric();//same password should be passed for both password & confirm password
		rp.enterPassword(password);
		rp.enterConfirmPassword(password);//number+alphabets
		rp.clickOnAgreeCheckBox();
		rp.clickOnContinue();
		
		logger.info("Validation");
		String actualMsg=rp.getConfiramationMsg();
		String expectedMsg="Your Account Has Been Created!";
		//Validation
		Assert.assertEquals(actualMsg, expectedMsg);
		}catch(Exception e) {
			logger.debug("Test Script Failed");
			Assert.fail();
		}
	}

}

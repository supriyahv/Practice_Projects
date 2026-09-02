package Register;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseTest;
import ObjectRepository.AccountSuccessPage;
import ObjectRepository.RegisterPage;
import ObjectRepository.WelcomePage;
import Utils.CommonUtils;

public class TC_RF_001 extends BaseTest {
	//WebDriver driver ;
	Properties prop;//global variable
	WelcomePage wp ;
	RegisterPage rp;
	AccountSuccessPage asp;
	
	@BeforeMethod
	public void Setup() {
		driver=openBrowserAndLaunchApplication();
		prop = CommonUtils.loadProperties();
		wp = new WelcomePage(driver);
		wp.clickOnMyAccount();
		rp = wp.selectRegister();
	}
	
	
	@AfterMethod
	public void teardown() {
		//driver.quit();
	}
	
	@Test
	
	public void verifyRegisterWithMandatoryField() throws InterruptedException {
		
		Thread.sleep(2000);
		rp.enterFirstName(prop.getProperty("firstname"));
		rp.enterlastFirstName(prop.getProperty("lastname"));
		rp.enterEmail(CommonUtils.generateBrandNewEmailID());
		rp.enterTelephone(prop.getProperty("telephone"));
		rp.enterPassword(prop.getProperty("password"));
		rp.enterConfirmPassword(prop.getProperty("confirmpassword"));
		rp.clickOnAgreeCheckBox();
		asp = rp.clickOnContinueButton();
		
		Assert.assertTrue(asp.accountSuccessMeassage());
		
		String ExpectedDetailsOne="Congratulations! Your new account has been successfully created!";
		String ExpectedDetailsTwo="You can now take advantage of member privileges to enhance your online shopping experience with us.";
		String ExpectedDeailsThree="If you have ANY questions about the operation of this online shop, please e-mail the store owner.";
		String ExpectedDetailsFour="A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please ";

		  String actualDetails = asp.accountSuccessDetails();
		 // System.out.println(actualDetails);
		  
		  Assert.assertTrue(actualDetails.contains(ExpectedDetailsOne));
		  
		  asp.clickOnContinue();
		  asp.accountInformationText();
		 
		
	}

}

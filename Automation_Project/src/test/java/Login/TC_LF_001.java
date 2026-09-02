package Login;

import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseTest;
import ObjectRepository.AccountPage;
import ObjectRepository.AccountSuccessPage;
import ObjectRepository.ForgottenpasswordPage;
import ObjectRepository.LoginPage;
import ObjectRepository.RegisterPage;
import ObjectRepository.WelcomePage;
import Utils.CommonUtils;

public class TC_LF_001 extends BaseTest {
	
	//WebDriver driver ;
		Properties prop;//global variable
		WelcomePage wp ;
		LoginPage lp ;
		AccountPage accountpage;
		ForgottenpasswordPage forgottonpass;
		
		
		@BeforeMethod
		public void Setup() {
			driver=openBrowserAndLaunchApplication();
			prop = CommonUtils.loadProperties();
			wp = new WelcomePage(driver);
			//click on my account 
			wp.clickOnMyAccount();
			//click on login
			lp=wp.clickOnLogin();
			
		}
		
		
		@AfterMethod
		public void teardown() {
			//driver.quit();
		}
	
	@Test
	public void verifyLoginWithValidCredential() {
		//validate user navigated to login page
		Assert.assertTrue(lp.didWeNavigateToLoginPage());
		//enter email
		lp.enterEmail(prop.getProperty("email"));
		lp.enterPassword(prop.getProperty("password"));
		accountpage = lp.clickOnLogin();
		
		//Validate user navigated to Account Page
		Assert.assertTrue(accountpage.didWeNavigateToAccountPage());	
		
	}
	
	@Test
	public void verifyLoginWithInvalidCredential() {
	
				//enter email
				lp.enterEmail(prop.getProperty("email"));
				lp.enterPassword(prop.getProperty("password"));
				accountpage = lp.clickOnLogin();
				Assert.assertTrue(lp.warningMsg());//check waring msg is displayed
				//validate warning msg
				String expectedwarning="Warning: No match for E-Mail Address and/or Password.";
				Assert.assertEquals(lp.warningTex(), expectedwarning);
				System.out.println(lp.warningTex());
				
	}
	
	@Test
	public void verifyLoginWithoutCredentials() {
		accountpage = lp.clickOnLogin();
		String expectedwarning="Warning: No match for E-Mail Address and/or Password.";
		Assert.assertEquals(lp.warningTex(), expectedwarning);
	}
	
	@Test
	public void verifyForgottenPasswordLinkOnLoginPage() {
		//validate navigate to login page
		Assert.assertTrue(lp.didWeNavigateToLoginPage());
		//validate forgotten password is present
		Assert.assertTrue(lp.forgottenPasswordText());
		//click on forgottenpassword
		 forgottonpass = lp.clickOnForgottenPassword();
		 //validate navigate to forgotten password page
		 Assert.assertTrue(forgottonpass.avalibilityOfForgottenPassword());
		
		
	}
	
	@Test
	public void verifyLoginFeildsPlaceholder() {
		
		String expectedemailText="E-Mail Address";
		Assert.assertEquals(lp.EmailText(), expectedemailText);
		
		String expectedpasswordText="Password";
		Assert.assertEquals(lp.passwordText(), expectedpasswordText);
		
	}

}

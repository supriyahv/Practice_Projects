package Register;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BasePageClass;
import POM.HomePage;
import POM.LoginPage;
import POM.MyAccountPage;

public class TC002_LoginFunctionalityTest extends BasePageClass{
	
	@Test
	public void verify_Login_Functionality() throws IOException {
		
		String EMAIL=fu.getDataFromPropertyFile("email");
		String PASSWORD=fu.getDataFromPropertyFile("password");
		
		HomePage hp = new HomePage(driver);
		hp.clickOnMyAccount();
		hp.clickLoginPage();
		
		LoginPage lp = new LoginPage(driver);
		lp.enterEmail(EMAIL+"@gmail.com");
		lp.enterPassword(PASSWORD);
		lp.clickOnLogin();
		
		MyAccountPage mp = new MyAccountPage(driver);
		boolean targetMsg=mp.isMyAccountPageExsist();
		
		//Assert.assertEquals(targetMsg, true);
		Assert.assertTrue(targetMsg);
	}

}

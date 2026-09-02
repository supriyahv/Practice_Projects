package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BasePage;

public class HomePage extends BasePage {
	
	
	public HomePage(WebDriver driver) {
		
		super(driver);//calling parent class constructor by inheritance
	}
	
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement myAccountDropMenu;
	
	@FindBy(linkText="Register")
	private WebElement selectRegister;
	
	@FindBy(linkText="Login")
	private WebElement loginBtn;
	
	
	
	public WebElement getMyAccountDropMenu() {
		return myAccountDropMenu;
	}
	public WebElement getSelectRegister() {
		return selectRegister;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public void clickOnMyAccount() {
		myAccountDropMenu.click();
	}
	
	public void clickRegister() {
		selectRegister.click();
	}
	
	public void clickLoginPage() {
		loginBtn.click();
	}
	
	
//	public RegisterPage selectRegister() {
//		selectRegister.click();
//		return new RegisterPage(driver);
//	}
//	
//	public LoginPage clickOnLogin() {
//		loginBtn.click();
//		return new LoginPage(driver);
//	}
	

}

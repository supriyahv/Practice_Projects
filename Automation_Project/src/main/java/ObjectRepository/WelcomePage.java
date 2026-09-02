package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	WebDriver driver;//class level variable
	
	public WelcomePage(WebDriver driver) {
		this.driver=driver;//store browser instance to class level variable so all members of class can use it
		PageFactory.initElements(driver, this);
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
	public RegisterPage selectRegister() {
		selectRegister.click();
		return new RegisterPage(driver);
	}
	
	public LoginPage clickOnLogin() {
		loginBtn.click();
		return new LoginPage(driver);
	}
	

}

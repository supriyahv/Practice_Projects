package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-email")
	private WebElement emailEdt;
	
	
	@FindBy(id="input-password")
	private WebElement passwordEdt;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//ul[@class='breadcrumb']/descendant::a[text()='Login']")
	private WebElement loginBreadCrumb;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	private WebElement errorMsg;
	
	@FindBy(linkText="Forgotten Password")
	private WebElement forgottenPasswordLink;
	
	

	public WebElement getLoginBreadCrumb() {
		return loginBreadCrumb;
	}

	public WebElement getErrorMsg() {
		return errorMsg;
	}

	public WebElement getForgottenPasswordLink() {
		return forgottenPasswordLink;
	}

	public WebElement getEmailEdt() {
		return emailEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public boolean didWeNavigateToLoginPage() {
		return loginBreadCrumb.isDisplayed();
	}
	
	public void enterEmail(String emailId) {
		emailEdt.sendKeys(emailId);
	}
	
	public void enterPassword(String password) {
		passwordEdt.sendKeys(password);
	}
	
	public AccountPage clickOnLogin() {
		loginBtn.click();
		return new AccountPage(driver);
	}
	
	public boolean warningMsg() {
		return errorMsg.isDisplayed();
	}
	
	public String warningTex() {
		return errorMsg.getText();
	}
	
	public boolean forgottenPasswordText() {
		return forgottenPasswordLink.isDisplayed();
	}
	
	public ForgottenpasswordPage clickOnForgottenPassword() {
		forgottenPasswordLink.click();
		return new ForgottenpasswordPage(driver);
	}
	
	public String EmailText() {
		return emailEdt.getAttribute("placeholder");
	}
	
	public String passwordText() {
		return passwordEdt.getAttribute("placeholder");
	}
	

}

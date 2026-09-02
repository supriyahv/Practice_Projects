package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgottenpasswordPage {
	WebDriver driver;
	
	public ForgottenpasswordPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//ul[@class='breadcrumb']/descendant::a[text()='Forgotten Password']")
	private WebElement forgottenPasswordbreadcrumb;

	public WebElement getForgottenPasswordbreadcrumb() {
		return forgottenPasswordbreadcrumb;
	}
	
	public boolean avalibilityOfForgottenPassword() {
		return forgottenPasswordbreadcrumb.isDisplayed();
	}
}

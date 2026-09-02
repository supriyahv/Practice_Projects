package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	WebDriver driver;
	
	public AccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//ul[@class='breadcrumb']/descendant::a[text()='Account']")
	private WebElement accountBreadCrumb;
	
	public WebElement getAccountBreadCrumb() {
		return accountBreadCrumb;
	}

	public boolean didWeNavigateToAccountPage() {
		return accountBreadCrumb.isDisplayed();
	}

}

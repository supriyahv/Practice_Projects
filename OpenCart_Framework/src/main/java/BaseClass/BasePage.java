package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver=driver;//store browser instance to class level variable so all members of class can use it
		PageFactory.initElements(driver, this);
	}

}

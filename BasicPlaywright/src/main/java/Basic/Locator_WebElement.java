package Basic;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Locator_WebElement {
	
	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext brcx1 = browser.newContext();
		Page page = brcx1.newPage();
		
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Locator password = page.locator("text=Forgot your password? ");
		password.click();
		
		BrowserContext brcx2 = browser.newContext();
		Page page2 = brcx1.newPage();
		page2.navigate("https://academy.naveenautomationlabs.com/");
		
		Locator loginbtn = page2.locator("text=Login");
		System.out.println(loginbtn.count());
		loginbtn.first().click();
	}

}

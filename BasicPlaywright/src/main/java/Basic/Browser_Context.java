package Basic;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Browser_Context {
	
	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		BrowserContext brcx1 = browser.newContext();
		Page page1 = brcx1.newPage();
		page1.navigate("https://www.amazon.in");
		
		
		BrowserContext brcx2 = browser.newContext();
		Page page2 = brcx2.newPage();
		page2.navigate("https://www.flipkart.com");
		
		brcx1.close();
		page1.close();
		brcx2.close();
		page2.close();
		
		
	}

}

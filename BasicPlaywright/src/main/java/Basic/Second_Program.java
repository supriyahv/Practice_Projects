package Basic;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Second_Program {
	
	public static void main(String[] args) {
		
		Playwright playwright=Playwright.create();
		
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
					BrowserContext brcx1 = browser.newContext();
					Page page = brcx1.newPage();
					page.navigate("http://localhost:8888");
					page.fill(".user_name", "admin");
					System.out.println();
	}

}

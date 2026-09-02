package Practice;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class launchTest {
	
	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();//create-static method,Playwright-interface
		Browser browser = playwright.chromium().launch();
		Page page = browser.newPage();
		page.navigate("https://www.amazon.in");
		
		
	}

}

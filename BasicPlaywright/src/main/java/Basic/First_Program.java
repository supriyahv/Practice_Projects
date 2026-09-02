package Basic;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class First_Program {
	
	public static void main(String[] args) {
		
		//Set up connection, create()--start server[playwright is a interface]
		Playwright playwright=Playwright.create();
		
		//launch the browser in headless mode-no browser will open
		//Browser browser = playwright.chromium().launch();
		//Browser browser = playwright.firefox().launch();
		//Browser browser = playwright.webkit().launch();---safari
		
		//browser will open by giving headless is false.
		//To run script in headless mode give setHeadless(True)--without opening the window runs in background
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page = browser.newPage();
		
		page.navigate("https://www.flipkart.com");
		
		String currenttitle = page.title();
		System.out.println(currenttitle);
		String currentpage = page.url();
		System.out.println(currentpage);
		
		browser.close();//To close browser only
		playwright.close();//to close server
	}

}

package Basic;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TracerInspection {
	
	public static void main(String[] args) {
		
	
	
	Playwright playwright=Playwright.create();
	Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	
	Page page = browser.newPage();
	
	page.navigate("https://www.flipkart.com");
	
	String currenttitle = page.title();
	System.out.println(currenttitle);
	String currentpage = page.url();
	System.out.println(currentpage);
	
	browser.close();
	playwright.close();


}
}

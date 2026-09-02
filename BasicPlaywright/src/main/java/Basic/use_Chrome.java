package Basic;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class use_Chrome {
	
	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		LaunchOptions lop = new LaunchOptions();//to launch browser in chrome
		lop.setChannel("chrome");//chrome is casesensitive
		lop.setHeadless(false);
		Browser browser = playwright.chromium().launch(lop);//launching browser not in chromium
		Page page = browser.newPage();
		page.navigate("https://www.amazon.in");
		
		
	}

}

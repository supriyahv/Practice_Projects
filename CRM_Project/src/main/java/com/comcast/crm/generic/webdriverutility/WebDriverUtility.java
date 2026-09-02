package com.comcast.crm.generic.webdriverutility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	WebDriver driver;
	
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public void waitForPageToLoad() {//browser session ID
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void waitForElementPresent(WebDriver driver,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void switchNewBrowserTabOnUrl(WebDriver driver,String parenturl) {
		Set<String> windowID=driver.getWindowHandles();
		
		for(String id:windowID) {
			driver.switchTo().window(id);
			
			String acturl = driver.getCurrentUrl();
			
			if(acturl.equals(parenturl)) {
				break;
			}
		}
	}
	
	
	public void switchNewBrowserTabOnTitle(WebDriver driver,String childtitle) {
		Set<String> windowID=driver.getWindowHandles();
		
		for(String id:windowID) {
			driver.switchTo().window(id);
			
			String acttitle = driver.getTitle();
			
			if(acttitle.equals(childtitle)) {
				break;
			}
		}
	}
	
	public void SwitchToFrame(int index) {
		driver.switchTo().frame(index);
	}
	
	public void SwitchToFrame(WebDriver driver,String nameID) {
		driver.switchTo().frame(nameID);
	}
	
	public void SwitchToFrame(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public void switchToAlertAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void switchToAlertDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	public void switchToAlertSendkey(WebDriver driver,String data) {
		driver.switchTo().alert().sendKeys(data);
	}
	
	public void Select(WebElement element,String text) {
		Select s = new Select(element);
		s.selectByValue(text);
	}
	
	public void Select(WebElement element,int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	
	public void mouseMoveOnElement(WebDriver driver,WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	
	public void doubleClick(WebDriver driver,WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
	}
	

}

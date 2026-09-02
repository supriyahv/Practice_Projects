import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {
	
	public static void main(String[] args) {
		
	     WebDriver driver = new ChromeDriver();
         String expectedText = "Laptop";
         driver.get("https://testautomationpractice.blogspot.com/");
     List<WebElement> nextbutton = driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr"));
//     System.out.println(nextbutton.get(0).getText());
     for(int i=1;i<nextbutton.size();i++) {
             WebElement values = driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr[" + i + "]/td[2]"));
             System.out.println(values.getText());
             if(values.isDisplayed()){
                     break;
             }else {
                     nextbutton.get(i).click();
             }
     }
	}

}

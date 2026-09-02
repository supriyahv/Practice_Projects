
		import java.util.List;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
public class Pagination1 {
	
	public static void main(String[] args) {
		
		

		
		                                
		                                WebDriver driver = new ChromeDriver();
		                                String expectedText = "Router";
		                                driver.get("https://testautomationpractice.blogspot.com/");
		                                 List<WebElement> pagination=driver.findElements(By.xpath("//ul[@id='pagination']/li"));
		                               List<WebElement> sizeoftable = driver.findElements(By.xpath("//table[@id='productTable']//tbody/tr"));
		                                 for(WebElement pages:pagination) {
		                                         for(int i=1;i<sizeoftable.size();i++) {
		                                         String name=driver.findElement(By.xpath("//table[@id='productTable']//tbody/tr["+i+"]/td[2]")).getText();
		                                         if(name.equals(expectedText)) {
		                                                 System.out.println("Expected text found!");
		                                              break;
		                                         }
		                                         else
		                                                 pages.click();
		                                 }
		                                         
		                                 }
		                                 driver.quit();
		                        }
		                }


		        



	}

}

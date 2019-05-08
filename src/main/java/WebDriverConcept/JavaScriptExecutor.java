package WebDriverConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\katta\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		String js1=JavaScriptUtiliy.getTitleByJS(driver);
         System.out.println(js1);
        // JavaScriptUtiliy.refreshBrowserByJS(driver);
         //WebElement pwd=driver.findElement(By.linkText("Forgot Password?"));
         //JavaScriptUtiliy.clickElementByJS(pwd, driver);
         
         //JavaScriptUtiliy.generateAlert(driver, "Hi srilatha");
         //JavaScriptUtiliy.drawBorder(pwd, driver);
         WebElement sightmap=driver.findElement(By.linkText("Sitemap"));
         JavaScriptUtiliy.scrollIntoView(sightmap, driver);
         //JavaScriptUtiliy.scrollPageDown(driver);
         //String page_inner_text=JavaScriptUtiliy.getPageInnerText(driver);
         //System.out.println( page_inner_text);
         JavaScriptUtiliy.flash(sightmap, driver);
         
	}
}

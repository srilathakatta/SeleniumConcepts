package WebDriverConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class RelativeXpath2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\katta\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
		
			driver.get("http://makeseleniumeasy.com/2017/07/14/how-to-handle-a-web-table-in-selenium-webdriver/");
			
			List<WebElement> allRows= driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
			// Print book name whose price is greater than and equal to 1000
			System.out.println("========================================================================");
			System.out.println("Books with price greater than and equal to 1000 are below:");
			for(int i=2;i<=7;i++) 
			{ 
			WebElement priceColumn=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td[4]")); 
			if(Integer.parseInt(priceColumn.getText())>=1000)
			{
				WebElement bookName=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td[1]"));
				System.out.println(bookName.getText());
			}
			}
			System.out.println("========================================");
			driver.close();

}
}

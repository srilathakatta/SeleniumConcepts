package WebDriverConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\katta\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/indian-holidays");
		List<WebElement> element=driver.findElements(By.xpath("//span[text()='Mercury?']//parent::div[@class='tittle']//following-sibling::ul[@class='whymercury']//li"));
				for(int i=0;i<element.size();i++){
					String text=element.get(i).getText();
					System.out.println(text);
				}
	}

}

package WebDriverConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\katta\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		System.out.println(driver.getTitle());
		
	WebElement interactions=driver.findElement(By.xpath("//a[contains(text(),'Interactions')]"));
Actions action=new Actions(driver);
action.moveToElement(interactions).build().perform();
WebElement selectable=driver.findElement(By.xpath("//a[contains(text(),'Selectable')]"));

	selectable.click();
	
	
	
	
	}

}

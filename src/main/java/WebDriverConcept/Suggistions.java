package WebDriverConcept;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suggistions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\katta\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("Hyderabad");
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		List<WebElement> suggitions=driver.findElements(By.xpath("//ul[@class='autoFill']//li"));
		for(int i=0;i<suggitions.size();i++){
			//System.out.println(suggitions.get(i).getText());
		if(suggitions.get(i).getText().equals("Mehdipatnam, Hyderabad")){
			suggitions.get(i).click();
			}
		
		}

	}

}

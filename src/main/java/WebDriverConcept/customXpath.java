package WebDriverConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class customXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\katta\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://book.spicejet.com/Login.aspx");
		//driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("saibaba road");
//driver.findElement(By.cssSelector("input.wHuge4s2.country-mobile.country-mobile-login.required")).sendKeys("8537587585");
	driver.get("http://demo.automationtesting.in/Register.html");
	System.out.println(driver.getTitle());
	
	WebElement countryList=driver.findElement(By.id("countries"));
	Select select=new Select(countryList);
	select.selectByVisibleText("Austria");
	
	//WebElement interactions=driver.findElement(By.xpath("//a[contains(text(),'Interactions')]"));
	
	
	
	
	
	}
	}
	
	
	
	
	
	
	



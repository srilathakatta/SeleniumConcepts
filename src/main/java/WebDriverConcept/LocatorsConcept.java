package WebDriverConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\katta\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		String title=driver.getTitle();
		if(title.equals("Register"))
		{
			System.out.println("the title is:"+title);
		}
		else{
			System.out.println("the title is incorrect");
		}
		
		WebElement fullName=driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(2) > input"));
		fullName.sendKeys("Srilatha");
		WebElement lastName=driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(3) > input"));
		lastName.sendKeys("katta");
		WebElement skills=driver.findElement(By.id("Skills"));
		//Select select=new Select(skills);
		//select.selectByVisibleText("Software");
		selectDropDownValue(skills,"Java");
		
		
		}
public static void selectDropDownValue(WebElement element,String value){
	Select select=new Select(element);
	select.selectByVisibleText(value);
	
	
	
}
}

package WebDriverConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\katta\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//launch chrome
	driver.get("https://app.hubspot.com/login");//get the huspot url
	System.out.println(driver.getTitle());//print the title name on the console
	driver.navigate().to("https://freecrm.com/");//get the freecrm url
	System.out.println(driver.getTitle());//print the title name on the console
	driver.navigate().back();//coming back to hubspot
	System.out.println(driver.getTitle());
	driver.navigate().forward();//coming back to freecrm
	System.out.println(driver.getTitle());
	}
	
	

}

package WebDriverConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hubspottitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\katta\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/user-preferences/5004418");
		 System.out.println(driver.getTitle());

	}

}

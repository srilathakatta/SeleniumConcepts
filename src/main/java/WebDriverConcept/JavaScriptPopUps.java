package WebDriverConcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopUps {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\katta\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement goButton=driver.findElement(By.xpath("//input[@name='proceed']"));
			goButton.click();
				Alert alert=driver.switchTo().alert();
				String text=alert.getText();
				System.out.println(text);
				if(text.equals("Please enter a valid user name")){
					System.out.println("message is correct");
				}
				else{
					System.out.println("message is incorrect");
				}
	alert.accept();
	}

}

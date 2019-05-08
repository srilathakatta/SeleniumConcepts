package WebDriverConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentlaunguages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\katta\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//launch chrome
	driver.get("https://www.facebook.com");//launch url
	List<WebElement> linklist=driver.findElements(By.xpath("//*[@id='pageFooter']/ul/li/a"));
	System.out.println(linklist.size());
	for(int i=0;i<linklist.size();i++){
		String lanlist=linklist.get(i).getText();
		System.out.println(i+"----"+lanlist);
	}
	driver.quit();
	}

}

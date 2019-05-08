package WebDriverConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		 //We can not create the object of webdriver because it is interface
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\katta\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//top casting,to launch the browser
		driver.get("http://www.google.com");//to enter the url
		String title=driver.getTitle();//to get the title of the google browser
		System.out.println(title);
		//we have to validate the title 
		if(title.equals("Google"))
		{
			System.out.println("title is correct");
		}
		else 
		{
			System.out.println("title is not correct");
		
          }
driver.quit();
}

}
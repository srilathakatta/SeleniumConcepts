package WebDriverConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinkCount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\katta\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com");
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("CRM Software:Cloud Counting")){
			System.out.println("title is correct");
		}
		else{
			System.out.println("title is incorrect");
		}
		List<WebElement>LinksList=driver.findElements(By.tagName("a"));
		System.out.println(LinksList.size());
	for(int i=0;i<LinksList.size();i++){
		String text=LinksList.get(i).getText();
	//System.out.println(i+".......>"+text);
		if(text.equals("")){
			
		}
	
	else{
		System.out.println(i+".....>"+text);
		}
	}
}
}

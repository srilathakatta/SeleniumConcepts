package WebDriverConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropDownValuegetOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\katta\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement skills=driver.findElement(By.id("Skills"));

		selectValueByGetoptions(skills,"Software");
	}
public static void selectValueByGetoptions(WebElement element,String value){
Select select=new Select(element);
List<WebElement>skillsList=select.getOptions();
	System.out.println(skillsList.size());
	for(int i=0;i<skillsList.size();i++){
		String skillsValue=skillsList.get(i).getText();
		System.out.println("skills list:"+skillsValue);
if(skillsValue.equals(value)){
			skillsList.get(i).click();
		break;	
	
		}
		
		
	}
	
	
	
	
}
}

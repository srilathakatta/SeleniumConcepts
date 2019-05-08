package WebDriverConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDropDownValueByFindElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\katta\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		List<WebElement> skills=driver.findElements(By.xpath("//select[@id='Skills']/option"));
		System.out.println(skills.size());
		for(int i=0;i<skills.size();i++){
			String skillsValue=skills.get(i).getText();
			System.out.println("sills list are:"+ skillsValue);
			if(skillsValue.equals("AutoCAD")){
				skills.get(i).click();
				break;
		
              }
			else{
				System.out.println("AutoCAD is not exist");
			}
}
}
}
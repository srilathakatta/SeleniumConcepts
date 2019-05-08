package WebDriverConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ReadProp {
	public static WebDriver driver;
	public static void main(String[] args) {
		Properties prop=new Properties();
		try {
			
		FileInputStream fi=new FileInputStream("C:\\Users\\katta\\workspace\\SeleniumWebDriver\\src\\main\\java\\config.properties");
		
		try {
			prop.load(fi);
		} catch (IOException e) {
			e.printStackTrace();
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		String headless=prop.getProperty("headless");
		
		if(browserName.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\katta\\chromedriver.exe");
			if(headless.equals("yes")){
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--headless");
			driver=new ChromeDriver(co);
			}
			else{
				driver=new ChromeDriver();
			}
		}
	else{
				System.out.println(ConstantsVariables.BROWSER_MESSAGE);
			}
			driver.get(prop.getProperty("url"));
			String title=driver.getTitle();
			WebElement userName_ASB=driver.findElement(By.id("dUsername"));
			userName_ASB.sendKeys(prop.getProperty("username"));
			WebElement pwd_ASB=driver.findElement(By.name("password"));
			pwd_ASB.sendKeys(prop.getProperty("password"));
			driver.findElement(By.id("loginBtn")).click();
			driver.quit();
			
		}
		
		
		
	}



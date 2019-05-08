package WebDriverConcept;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopupHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\katta\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://popuptest.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Multi-PopUp Test']")).click();
		Set<String>windowhandles=driver.getWindowHandles();
		Iterator<String> it=windowhandles.iterator();
		String mainwindowid=it.next();
		System.out.println("the main window id is:"+mainwindowid);
		String childwindowid=it.next();
		System.out.println("the child window id is:"+childwindowid);
		driver.switchTo().window(childwindowid);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(mainwindowid);
		System.out.println(driver.getTitle());
		
		
		
	}

}

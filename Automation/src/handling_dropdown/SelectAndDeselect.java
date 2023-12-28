package handling_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAndDeselect {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///C:/Users/QSP/Desktop/dropdown.html");
	WebElement city = driver.findElement(By.id("city"));
	Select s=new Select(city);
//getOptions() is used to get all the options in any dropdown 
	List<WebElement> allOptions = s.getOptions();
	int count=allOptions.size();
	for(int i=0;i<count;i++) {
		s.selectByIndex(i);
//		Thread.sleep(500);
	}
	for(int i=count-1;i>=0;i--) {
		s.deselectByIndex(i);
	}
	for (WebElement ele : allOptions) {
		String text = ele.getText();
//String text = ele.getAttribute("value");
		s.selectByVisibleText(text);
	}
}
}

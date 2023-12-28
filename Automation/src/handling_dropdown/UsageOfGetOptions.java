package handling_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsageOfGetOptions {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///C:/Users/QSP/Desktop/dropdown.html");
//	driver.get("https://www.fb.com");
//	driver.findElement(By.linkText("Create new account")).click();
	WebElement city = driver.findElement(By.id("city"));
	Select s=new Select(city);
//getOptions() is used to get all the options in any dropdown 
	List<WebElement> allOptions = s.getOptions();
	int count=allOptions.size();
	System.out.println(count);
//	for(int i=0;i<allOptions.size();i++) {
//		WebElement ele = allOptions.get(i);
//		String text = ele.getText();
//		System.out.println(text);
//	}
//	for(WebElement ele:allOptions) {
//		System.out.println(ele.getText());
//	}
//getWrappedElement() will wrap all the options in the dropdown and return as WebElement
WebElement ele = s.getWrappedElement();
System.out.println(ele.getText());
}
}

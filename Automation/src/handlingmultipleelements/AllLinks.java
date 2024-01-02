//1.Print all the links in amazon application.
package handlingmultipleelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	int count=allLinks.size();
	//size() is present in List<WebElement> and it will fetch size of the elements.
	System.out.println(count);
	for(int i=0;i<count;i++) {
		WebElement ele = allLinks.get(i);
		String text = ele.getText();
		System.out.println(text);
	}
	driver.quit();
}
}
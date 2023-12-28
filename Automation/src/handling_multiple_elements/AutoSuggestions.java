package handling_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("selenium");
	Thread.sleep(2000);
List<WebElement> autoSuggs = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
int count = autoSuggs.size();
System.out.println(count);
for(int i=0;i<count;i++) {
	String text = autoSuggs.get(i).getText();
	System.out.println(text);
}
autoSuggs.get(count-1).click();

}
}

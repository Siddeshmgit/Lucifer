package handlingmultipleelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAutoSugg {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("Java");
	List<WebElement> autoSugg = driver.findElements(By.xpath("//span[contains(.,'java')]"));
	int count=autoSugg.size();
	System.out.println(count);
	for(int i=0;i<count;i++) {
		String All = autoSugg.get(i).getText();	
		System.out.println(All);
	}
	driver.quit();
}
}

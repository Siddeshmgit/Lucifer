package handlingframes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraMouseHover {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	List<WebElement> allNavTab = driver.findElements(By.className("desktop-main"));
	Actions a=new Actions(driver);
	for(int i=0;i<allNavTab.size();i++) {
		WebElement ele = allNavTab.get(i);
		a.moveToElement(ele).pause(2000).perform();
	}
	for(int i=allNavTab.size()-1;i>=0;i--) {
		WebElement ele = allNavTab.get(i);
		a.moveToElement(ele).pause(2000).perform();
	}
}
}

package handling_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelect {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSP/Desktop/dropdown.html");
	WebElement city = driver.findElement(By.id("city"));
	Select s=new Select(city);
	s.selectByIndex(0);
	s.selectByValue("m");	
	s.selectByVisibleText("Hyderabad");	
	s.deselectByValue("b");
	s.deselectByIndex(2);
	s.deselectByVisibleText("Mysore");
	s.deselectAll();
}
}

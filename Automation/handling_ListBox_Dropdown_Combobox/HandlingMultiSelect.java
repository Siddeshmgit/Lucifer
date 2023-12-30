package handling_ListBox_Dropdown_Combobox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelect {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); We have created static 
	//web Page.
	driver.get("file:///C:/Users/Home/Desktop/Dropdown.html");
	WebElement city = driver.findElement(By.id("city"));
	Select s=new Select(city);
	s.selectByIndex(0);
	s.selectByValue("m");
	s.selectByVisibleText("Hyderabad");
	//We are using deSelect()
	s.deselectByIndex(0);
	s.deselectByValue("m");
	s.deselectByVisibleText("Hyderabad");
	//To deselect all the options at a time we use deselectAll().
	s.deselectAll()
	}
}

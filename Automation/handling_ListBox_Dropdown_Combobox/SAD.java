package handling_ListBox_Dropdown_Combobox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WS to select in ascending order and deselect in descending order.
import org.openqa.selenium.support.ui.Select;

public class SAD {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Home/Desktop/Dropdown.html");
	WebElement city = driver.findElement(By.id("city"));
	Select s=new Select(city);
	List<WebElement> allOp = s.getOptions();
	for(int i=0;i<allOp.size();i++) {
		s.selectByIndex(i);
	}
	for(int i=0;i<allOp.size();i--) {
		s.deselectByIndex(i);
}
}
}


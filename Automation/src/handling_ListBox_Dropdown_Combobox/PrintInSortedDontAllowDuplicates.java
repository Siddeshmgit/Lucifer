package handling_ListBox_Dropdown_Combobox;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintInSortedDontAllowDuplicates {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Home/Desktop/Dropdown.html");
	WebElement city = driver.findElement(By.id("city"));
	Select s=new Select(city);
	List<WebElement> allOp = s.getOptions();
	Set<String>ts = new TreeSet<>();
	//TreeSet will not allow duplicate and it sorts element in ascending order.
	int count=allOp.size();
	for(int i=0;i<allOp.size();i++) {
		String text=allOp.get(i).getText();
		ts.add(text);
}
	System.out.println("Sorted.....");
	for (String text: ts) {
		System.out.print(text+" ");
		
	}
}
}
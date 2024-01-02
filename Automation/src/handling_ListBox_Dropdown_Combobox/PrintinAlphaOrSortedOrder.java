package handling_ListBox_Dropdown_Combobox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintinAlphaOrSortedOrder {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Home/Desktop/Dropdown.html");
	WebElement city = driver.findElement(By.id("city"));
	Select s=new Select(city);
	List<WebElement> allOp = s.getOptions();
	List<String> al = new ArrayList<>();//Generic collection
	int count=allOp.size();
	for(int i=0;i<allOp.size();i++) {
		String text=allOp.get(i).getText();
		al.add(text);
	}
	System.out.println("Before Sorting");
	for (String text : al) {
		System.out.print(text+"");
		System.out.println();
		}
	Collections.sort(al);
	System.out.println("After sorting");
	for (String text : al) {
		System.out.print(text+"");
	}
}
}

package handling_dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintInSortedOrder {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSP/Desktop/dropdown.html");
	WebElement city = driver.findElement(By.id("city"));
	Select s=new Select(city);
	List<WebElement> allOpt = s.getOptions();
	List<String> al=new ArrayList<>();
	int count = allOpt.size();
	for(int i=0;i<count;i++) {
		String text = allOpt.get(i).getText();
		al.add(text);}
	System.out.println("Before Sorting");
	for (String text : al) {
		System.out.print(text+" ");}
	System.out.println();
//Elements will be added in same order of List<WebELement> we need to do sorting explicitly using:
	Collections.sort(al);
	System.out.println("After Sorting");
	for (String text : al) {
		System.out.print(text+" ");
	}
}
}

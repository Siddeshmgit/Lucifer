package handling_dropdown;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOnlyDuplicates {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSP/Desktop/dropdown.html");
	WebElement city = driver.findElement(By.id("city"));
	Select s=new Select(city);
	List<WebElement> allOpt = s.getOptions();
	List<String>al=new ArrayList<>();
	Set<String> ts=new TreeSet<>();
	for(int i=0;i<allOpt.size();i++) {
		String text = allOpt.get(i).getText();
	if(!ts.add(text)) {
		al.add(text);
	}
	}
	for (String text : al) {
		System.out.println(text);
	}
}
}

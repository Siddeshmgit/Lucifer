package handling_dropdown;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintWithoutDuplicates {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSP/Desktop/dropdown.html");
	WebElement city = driver.findElement(By.id("city"));
	Select s=new Select(city);
	List<WebElement> allOpt = s.getOptions();
//Hashset will not allow duplicates but it will not sort the elements automatically like TreeSet
	Set<String> hs=new HashSet<>();
	int count = allOpt.size();
	for(int i=0;i<count;i++) {
		String text = allOpt.get(i).getText();
		hs.add(text);}
	for (String text : hs) {
		System.out.print(text+" ");
	}
}
}

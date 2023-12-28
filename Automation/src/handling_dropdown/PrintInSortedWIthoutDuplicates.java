package handling_dropdown;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintInSortedWIthoutDuplicates {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSP/Desktop/dropdown.html");
	WebElement city = driver.findElement(By.id("city"));
	Select s=new Select(city);
	List<WebElement> allOpt = s.getOptions();
//TreeSet will not allow duplicates as well as it will sort the elements automatically
	Set<String> ts=new TreeSet<>();
	int count = allOpt.size();
	for(int i=0;i<count;i++) {
		String text = allOpt.get(i).getText();
		ts.add(text);}
	System.out.println("After Sorting");
	for (String text : ts) {
		System.out.print(text+" ");
	}

}
}

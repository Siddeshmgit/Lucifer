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

public class PrintOnlyDublicates {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Home/Desktop/Dropdown.html");
	WebElement city = driver.findElement(By.id("city"));
	Select s=new Select(city);
	List<WebElement> allOp = s.getOptions();
	List<String>al=new ArrayList<>();
	//1St collection to allow only duplicates
	Set<String>ts = new TreeSet<>();
	//2nd collection to allow all options.
	int count=allOp.size();
	for(int i=0;i<allOp.size();i++) {
		String text=allOp.get(i).getText();
		if(!ts.add(text));{
			al.add(text);
		}
}
	System.out.println("only duplicates");
	for (String text: al) {
		System.out.println(text);
		
	}
}
}
}

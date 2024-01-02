package handling_ListBox_Dropdown_Combobox;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllWithoutDuplicate {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Home/Desktop/Dropdown.html");
	WebElement city = driver.findElement(By.id("city"));
	Select s=new Select(city);
	List<WebElement> allOp = s.getOptions();
	Set<String>hs = new HashSet<>();
	//HashSet will not allow duplicate.
	int count=allOp.size();
	for(int i=0;i<allOp.size();i++) {
		String text=allOp.get(i).getText();
		hs.add(text);
}
	System.out.println("Not sSorted.....");
	for (String text: hs) {
		System.out.print(text+" ");
		
	}
}
}
}

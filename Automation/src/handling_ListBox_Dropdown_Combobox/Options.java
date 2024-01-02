//WS to print all the options present in any dropdown.
package handling_ListBox_Dropdown_Combobox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Options {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Home/Desktop/Dropdown.html");
	WebElement city = driver.findElement(By.id("city"));
	Select s=new Select(city);
	List<WebElement> allOp = s.getOptions();
	//it is used to get all the options present in dropdown
	for(int i=0;i<allOp.size();i++) {
		WebElement ele = allOp.get(i);
		String text = ele.getText();
		System.out.println(text);
	}
	WebElement wrap = s.getWrappedElement();
	//getWrappedElement() will wrap all the options in the dropdown and return as web element.
	System.out.println(wrap.getText());
}
}

package handling_ListBox_Dropdown_Combobox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetMethod {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Home/Desktop/Dropdown.html");
	WebElement language = driver.findElement(By.id("lang"));
	Select s=new Select(language);
	WebElement firstop = s.getFirstSelectedOption();
	//It is used to fetch the selected 1 st option
	//NoSuchElementE
	List<WebElement> allop = s.getAllSelectedOptions();
	//It is used to fetch the selected all option
	//EmptyList
	for(int i=0;i<allop.size();i++) {
		String text = allop.get(i).getText();
		System.out.println(text);
	}
	boolean res = s.isMultiple();
	if(res==true) {
		System.out.println("It is a multi select dropdown");
	}
	else {
		System.out.println("It is a single select dropdown");
	}
}
}

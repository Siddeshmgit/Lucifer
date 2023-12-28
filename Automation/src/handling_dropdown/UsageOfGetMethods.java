package handling_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsageOfGetMethods {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	driver.get("https://www.fb.com");
//	driver.findElement(By.linkText("Create new account")).click();
	driver.get("file:///C:/Users/QSP/Desktop/dropdown.html");
	WebElement lang = driver.findElement(By.id("lang"));
	Select s=new Select(lang);
//It will return the first selected option in the dropdown in the form of WebElement
//if there is no selected option it will return NSEE
	WebElement ele = s.getFirstSelectedOption();
	System.out.println(ele.getText());
//It will return all the selected options in the dropdown in the form of List<WebElement>
// if there is no selected option it will return Empty List
	List<WebElement> allEle = s.getAllSelectedOptions();
	for(int i=0;i<allEle.size();i++) {
		String text = allEle.get(i).getText();
		System.out.println(text);}
//isMultiple() is used to check whether dropdown is single select or multi select
	boolean res = s.isMultiple();
	if(res==true) {
		System.out.println("It is a multi select dropdown");
	}else {
		System.out.println("It is a single select dropdown");
	}
}
}

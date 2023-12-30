package handling_ListBox_Dropdown_Combobox;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingScanner {
public static void main(String[] args) {
	System.out.println("Enter the city name");
	Scanner s=new Scanner(System.in);
	String city = s.nextLine();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Home/Desktop/Dropdown.html");
	WebElement ele = driver.findElement(By.id("city"));
	Select s1=new Select(ele);
	List<WebElement> allOp = s1.getOptions();
	for(int i=0;i<allOp.size();i++) {
		String text=allOp.get(i).getText();
		if(text.equalsIgnoreCase(city)) {
		System.out.println(city+"The city is present in the dropdown");	
		}
		else {
			System.out.println(city+"The city is not present in the dropdown");
		}
		
		}
	
}
}

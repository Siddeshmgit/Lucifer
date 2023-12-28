package assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOptionsInSortOrder {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/msamo/OneDrive/Desktop/Dropdown.html");
		WebElement lang = driver.findElement(By.id("lang"));
		Select s1=new Select(lang);
		List<WebElement> allc = s1.getOptions();
		List<String> al = new ArrayList<>();
		for (int i = 0; i < allc.size(); i++) {
			  String text = allc.get(i).getText();
			  al.add(text);	
		}
		System.out.println("after sorting:");
		Collections.sort(al);
		for (String s : al) {
		System.out.println(s);
			
		}
			
	
		
		
		
		

	}

}

package handling_dropdown;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingScanner {
public static void main(String[] args) {
	System.out.println("Enter the City name");
	try (Scanner s = new Scanner(System.in)) {
		String city = s.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/dropdown.html");
		WebElement ele = driver.findElement(By.id("city"));
		Select select=new Select(ele);
		List<WebElement> allOpt = select.getOptions();
		int count=0;
		for(int i=0;i<allOpt.size();i++) {
			String text = allOpt.get(i).getText();
			if(city.equalsIgnoreCase(text)) {
				count++;
				break;}
		}
		if(count>0) {
			System.out.println(city+" is present in the dropdown");
		}else {
			System.out.println(city+" is not present in the dropdown");
		}
	}
}
}

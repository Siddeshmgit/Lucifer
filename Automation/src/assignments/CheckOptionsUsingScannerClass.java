package assignments;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckOptionsUsingScannerClass {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter options:");
String eoption = s.next();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("file:///C:/Users/msamo/OneDrive/Desktop/Dropdown.html");
WebElement ele = driver.findElement(By.id("city"));
Select sel=new Select(ele);
List<WebElement> alloptions = sel.getOptions();
int count=1;
for (int i = 0; i < alloptions.size(); i++) {
	String aoption = alloptions.get(i).getText();
	if (aoption.equalsIgnoreCase(eoption)) {
		count++;
		break;}}
	if (count>0) 
	{
		System.out.println("Expected Option is there in options");	
	} 
	else
	{
		System.out.println("Expected Option is not there in options");
	}
}
}



package handling_ListBox_Dropdown_Combobox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DateOfBirth {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.linkText("Create new Account")).click();
	WebElement day = driver.findElement(By.id("day"));
	Select s=new Select(day);
	s.selectByIndex(18);
	WebElement month = driver.findElement(By.id("month"));
	Select s1=new Select(month);
	s1.selectByVisibleText("Apr");
	WebElement year= driver.findElement(By.id("year"));
	Select s2=new Select(year);
	s2.selectByVisibleText("1994");
	}
}

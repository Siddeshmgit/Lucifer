package handling_ListBox_Dropdown_Combobox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/* Developers will use div and select tag in order to ComboBox.
 * If they used div tag we have to use click().
 * If they use select tag to handle dropdown we need to create object of Select class.
 * Select s=new Select(inside wch we have to pass web element reference variable as parameter)
 * By using Select class reference we can access 12 nonstatic methods.
 * Value passed for Select method doesnt match it will throw NoSuchElementException. 
 * For singleSelect Dropdown if we use deSelect() we get UnsupportedOperationException. 
*/
public class SingleSelectDropdown {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new Account")).click();
	WebElement month = driver.findElement(By.id("month"));
	Select s=new Select(month);
	s.selectByIndex(0);
	//selectByIndex() will select the option based upon index of the element.
	s.selectByValue("4");
	//selectByValue(String) will select the option which contains the mentioned value.
	s.selectByVisibleText("oct");
	//selectByVisibleText(String) will select the option which contains the mentioned highlighted text.

}
}

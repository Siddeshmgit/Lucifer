package methodsofwebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAtt_TagName_TagText {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement ele = driver.findElement(By.name("login"));
	//--------------------------------------------//
	String attValue = ele.getAttribute("type");//Return type is String
	/*getAttribute(String AttributeName) is used to get the attribute value of an web element.
	 * It also return null if there is no mentioned attribute
	*/
	System.out.println("The attribute value of type attribute:"+attValue);
	//------------------------------------------//
	//getTagName() is used to fetch the tagName of WebElement. Return type is String
	String tagName = ele.getTagName();
	System.out.println("The tagName of login button:"+tagName);
	//---------------------------------------------//
	/*getText() is used to fetch the tagText of a web element
	 *If the element is not having tagText it will return blankspace 
	 */
	String tagText = ele.getText();
	System.out.println("The tagtext of loginbutton:"+tagText);
	}
}/*
The attribute value of type attribute:submit
The tagName of login button:button
The tagtext of loginbutton:Log in*/


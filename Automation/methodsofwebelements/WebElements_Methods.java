/*Automate following scenario navigate to fb application.and enter dinga@123 in UN textbox in 
 * Uppercase and clear the value present in the textbox.Check whether create new account link is 
 * displayed and enabled get the tagName,tagText and attribute value of create new account link.
 * Get the x axis and y axis value of FB logo as well as size of the logo.
 * Click on create new account button and select male radiobutton check whether it is 
 * selected or not. Get the colour of signUp button and click on signUp using submit button. */
package methodsofwebelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements_Methods {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebElement ele = driver.findElement(By.id("email"));
	//1.sendKeys()-------------------------------------------
    ele.sendKeys(Keys.SHIFT+"dinga@");
    ele.sendKeys("123.");
    ele.sendKeys(Keys.SHIFT+"in");
    System.out.println("With the help of sendKeys we are able to enter DINGA@123");
    //2.clear()--------------------------------------------------
    ele.clear();
    Thread.sleep(5000);
    WebElement ele1 = driver.findElement(By.xpath("//a[@rel='async']")); 
    Thread.sleep(2000);
    //3.isDisplayed()---------------------------------------------
    boolean res = ele1.isDisplayed();
    if(res==true) {
    System.out.println("Create a new account link is displayed");
    }
    else {
    	System.out.println("Create a new account link is not displayed");	
    }
    //4.isEnabled()----------------------------------------------
    boolean res1 = ele1.isEnabled();
    if(res1==true) {
    	System.out.println("Create a new account link is Enabled");	
    }
    else {
    	System.out.println("Create a new account link is not Enabled");	
    }
    //5.getTagName()------------------------------------------------
    String name = ele1.getTagName();
    System.out.println("The tagName of Create a new account button:"+name);
    //6.getText()------------------------------------------------------
    String text = ele1.getText();
    System.out.println("The tagText of Create a new account button:"+text);
    //7.getAttribute()----------------------------------------------
    String att = ele1.getAttribute("role");
    System.out.println("The Attribute value of Create a new account button:"+att);
    //8.getLocation()----------------------------------------------------
    int Xaxis = driver.findElement(By.tagName("img")).getLocation().getX();
    int Yaxis = driver.findElement(By.tagName("img")).getLocation().getY();
    System.out.println("X axis of the FB logo: "+Xaxis);
    System.out.println("Y axis of the FB logo: "+Yaxis);
     driver.findElement(By.tagName("img"));
    //9.getSize()------------------------------------------
    int h1 = driver.findElement(By.tagName("img")).getSize().getHeight();
    int w1 = driver.findElement(By.tagName("img")).getSize().getWidth();
    System.out.println("Height of the FB logo is :"+h1);
    System.out.println("Height of the FB logo is :"+w1);
    //10.getRectangle()---------------------------------------
    driver.findElement(By.tagName("img")).getLocation().getX();
    driver.findElement(By.tagName("img")).getSize().getHeight();
    //11.click()---------------------------------------------------------
    driver.findElement(By.xpath("//a[@rel='async']")).click();
    Thread.sleep(2000);
    //12.isSelected()-------------------------------------------------
    driver.findElement(By.xpath("//label[.='Male']")).click();
    boolean sel = driver.findElement(By.xpath("//input[@type='radio']")).isSelected();
    if(sel==true) {
    	System.out.println("Pass :Male radio button is selected");
    	}
    else {
    	System.out.println("Fail :Male radio button is not selected");
    }
    //13.getCssValue()----------------------------------------
    String col = driver.findElement(By.name("websubmit")).getCssValue("color");
    System.out.println("Color of SignUp button :"+col);
    //14.submit()--------------------------------------
    driver.findElement(By.name("websubmit")).submit();
    System.out.println("We are clicking on SignUp button using submit()");
    driver.quit();
   }
}
/*
With the help of sendKeys we are able to enter DINGA@123
Create a new account link is displayed
Create a new account link is Enabled
The tagName of Create a new account button:a
The tagText of Create a new account button:Create new account
The Attribute value of Create a new account button:button
X axis of the FB logo: 156
Y axis of the FB logo: 176
Height of the FB logo is :106
Height of the FB logo is :321
Fail :Male radio button is not selected
Color of SignUp button :rgba(255, 255, 255, 1)
We are clicking on SignUp button using submit()
*/
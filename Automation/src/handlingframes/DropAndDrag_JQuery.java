package handlingframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropAndDrag_JQuery {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/droppable/");
	driver.switchTo().frame(0);
	WebElement drag = driver.findElement(By.id("draggable"));
	WebElement drop = driver.findElement(By.id("droppable"));
	Actions a=new Actions(driver);
	a.dragAndDrop(drag, drop).perform();
	
}
}

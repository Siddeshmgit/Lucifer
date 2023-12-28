package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	WebElement draggable = driver.findElement(By.className("draghandle"));
	WebElement draggable2 = driver.findElement(By.xpath("//h1[text()='Block 2']"));
	WebElement target = driver.findElement(By.id("column-3"));
	Actions a=new Actions(driver);
	a.dragAndDrop(draggable, target).release().perform();
	Thread.sleep(2000);
a.clickAndHold(draggable2).moveToElement(target).pause(2000).release().build().perform();
}
}

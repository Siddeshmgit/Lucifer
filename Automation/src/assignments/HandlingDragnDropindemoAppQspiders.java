package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDragnDropindemoAppQspiders {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
		driver.get("https://demoapps.qspiders.com/dragDrop/dragToCorrect?sublist=1");
		List<WebElement> draggable = driver.findElements(By.className("draggable"));
		WebElement t1 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement t2 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		Actions a=new Actions(driver);
for (int i = 0; i < draggable.size(); i++) {
	WebElement drag = draggable.get(i);
	if (i==0||i==2) {
	a.dragAndDrop(drag,t1).pause(1000).perform();
}
	else
	{
	//a.dragAndDrop(drag,t2).pause(1000).perform();
	a.clickAndHold(drag).pause(1000).moveToElement(t2).release().build().perform();
		
	}
	}
	}
}

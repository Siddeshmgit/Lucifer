package handlingMouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/button/buttonDoubleClick?sublist=2");
    WebElement button = driver.findElement(By.id("btn20"));
    Actions a=new Actions(driver);
    a.doubleClick(button).perform();
    Thread.sleep(2000);
    WebElement button1 = driver.findElement(By.id("btn21"));
    a.doubleClick(button1).perform();
    WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'You selected')]"));
    String text = ele.getText();
    System.out.println(text);
}
}

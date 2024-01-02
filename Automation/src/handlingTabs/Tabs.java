package handlingTabs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tabs {
public static void main(String[] args) {
  ChromeOptions opt=new ChromeOptions();
  opt.addArguments("--disable-notifications","--start-maximized");
  WebDriver driver=new ChromeDriver(opt);
  driver.get("https://pib.gov.in/indexd.aspx");
  driver.switchTo().alert().accept();
  driver.findElement(By.linkText("Ministry of Commerce & Industry")).click();
  driver.switchTo().alert().accept();
  Set<String> allWid = driver.getWindowHandles();
  for (String wid: allWid) {
	  driver.switchTo().window(wid);
    }
  String title = driver.getTitle();
  System.out.println(title);
}
}

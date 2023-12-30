package methods_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ExecutionClass {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	Demo.testA(driver);
	Thread.sleep(5000);
	EdgeDriver driver1=new EdgeDriver();
	Demo.testA(driver1);
	driver.quit();

}
}

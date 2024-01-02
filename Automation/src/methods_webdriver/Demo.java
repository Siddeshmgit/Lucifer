package methods_webdriver;

import org.openqa.selenium.WebDriver;

public class Demo extends ExecutionClass{
public static void testA(WebDriver driver) {
	driver.get("https://www.google.com/");
	driver.close();
	
}
}

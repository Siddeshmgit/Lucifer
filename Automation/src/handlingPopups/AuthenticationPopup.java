package handlingPopups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	//We are handling authentication popup by passing un and pwd in get method.
	
}
}

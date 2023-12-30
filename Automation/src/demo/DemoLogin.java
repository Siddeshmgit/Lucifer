package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;
public class DemoLogin {
	@Test
public void demo() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost/login.do");
	LoginPage l=new LoginPage(driver);
	l.setLogin("admin1","manager1");
	Thread.sleep(5000);
	l.setLogin("admin", "manager");
	HomePage h=new HomePage();
	PageFactory.initElements(driver, h);
	Thread.sleep(3000);
	h.logout();
}
}

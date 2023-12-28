package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginPageDemo {
	
private WebElement unTbx;							//Declaration
private WebElement pwdTbx;
private WebElement loginBtn;

public LoginPageDemo(WebDriver driver) {
//	unTbx=driver.findElement(By.id("username"));	//Initialization
//	pwdTbx=driver.findElement(By.name("pwd"));
//	loginBtn=driver.findElement(By.xpath("//div[text()='Login ']"));
}
//Business Logic method	
public void setLogin(String un,String pwd) {
	unTbx.sendKeys(un);
	pwdTbx.sendKeys(pwd);							//Utilization
	loginBtn.click();
}

public void display() {
	System.out.println(unTbx);
	System.out.println(pwdTbx);
	System.out.println(loginBtn);
}
}

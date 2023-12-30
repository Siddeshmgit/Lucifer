package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private WebElement unTbx ;
	private WebElement pwdTbx;       //Declaration
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		unTbx=driver.findElement(By.id("username"));   //Initialisation
		pwdTbx=driver.findElement(By.name("pwd"));
		loginBtn=driver.findElement(By.xpath("//div[text()='Login ']"));
	}
	public void setLogin(String un,String pwd) {
		unTbx.sendKeys(un);
		pwdTbx.sendKeys(pwd);    //Utilisation
		loginBtn.click();
	}
}

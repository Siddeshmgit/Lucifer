package data_driven_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProvider {
@DataProvider
public Object[][] getData() {
//	Object[][]data=new Object[3][3]; 
//	data[0][0]="http://localhost/login.do";
//	data[0][1]="admin";
//	data[0][2]="manager";
	Object[][]data= {
	{"http://localhost/login.do","admin","manager"},
	{"http://localhost/login.do","admin1","manager1"}
	,{"http://localhost/login.do","admin2","manager2"}};
	return data;
}
@Test(dataProvider = "getData")
public void demo(String url,String un, String pwd) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pwd);
	driver.findElement(By.partialLinkText("Login")).click();
}
}

package com.actitime.generic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		FileLib f=new FileLib();
		String url = f.readDataFromProperty("url");
		String un = f.readDataFromProperty("username");
		String pwd = f.readDataFromProperty("password");
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		String data = f.readDataFromExcel("Sheet1",1,3);	
		System.out.println(data);
		String data1 = f.readDataFromExcel("InvalidLogin",4,1);
		System.out.println(data1);
		String compName = f.readDataFromExcel("Sheet1", 1, 4);
		System.out.println(compName);
		f.writeDataIntoExcel("Sheet1", 1, 5,"Pass");
		f.writeDataIntoExcel("Sheet1", 1, 4, "Infosys");
		f.writeDataIntoExcel("InvalidLogin", 1, 0, "roja");
	}
}

package com.actitime.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
@FindBy(id="logoutLink")
private WebElement logoutBtn;

public void logout() {
	logoutBtn.click();
}
}

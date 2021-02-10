package sauceDemoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IndexPage {
	WebDriver driver;
	WebElement usernameField;
	WebElement passwordField;
	WebElement loginButton;

	public IndexPage(WebDriver driver) {	
		this.driver = driver;
	}

	public WebElement getUsernameField() {
		return driver.findElement(By.id("user-name"));
	}

	public WebElement getPasswordField() {
		return driver.findElement(By.id("password"));
	}

	public WebElement getLoginButton() {
		return driver.findElement(By.id("login-button"));
	}
	
	public void login (String username, String password) {
		this.getUsernameField().clear();
		this.getUsernameField().sendKeys(username);
		this.getPasswordField().clear();
		this.getPasswordField().sendKeys(password);
		this.loginButtonClick();
	}
	
	public void loginButtonClick () {
		this.getLoginButton().click();
	}
	
	

}

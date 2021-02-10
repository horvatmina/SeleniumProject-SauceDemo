package sauceDemoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
	WebDriver driver;
	WebElement firstName;
	WebElement lastName;
	WebElement zipCode;
	WebElement continueButton;
	WebElement finishButton;
	WebElement thankyou;
	
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirstName() {
		return driver.findElement(By.id("first-name"));
	}

	public WebElement getLastName() {
		return driver.findElement(By.id("last-name"));
	}

	public WebElement getZipCode() {
		return driver.findElement(By.id("postal-code"));
	}

	public WebElement getContinueButton() {
		return driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input"));
	}

	public WebElement getFinishButton() {
		return driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]"));
	}

	public WebElement getThankyou() {
		return driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2"));
	}

	public void continueButtonClick () {
		this.getContinueButton().click();
	}
	public void finishButtonClick () {
		this.getFinishButton().click();
	}
	
	public void firstName () {
		this.getFirstName().sendKeys("Maja");
	}
	
	public void lastName () {
		this.getLastName().sendKeys("Majic");
	}
	
	public void zipCode () {
		this.getZipCode().sendKeys("123456");
	}
		

}

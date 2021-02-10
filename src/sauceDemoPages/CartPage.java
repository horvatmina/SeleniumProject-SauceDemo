package sauceDemoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	WebDriver driver;
	WebElement checkout;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getCheckout() {
		return driver.findElement (By.cssSelector("a[class='btn_action checkout_button']"));
	}
	
	public void checkoutClick () {
		this.getCheckout().click();
	}
		
}

package sauceDemoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {
	WebDriver driver;
	WebElement item1;
	WebElement addToCart;
	WebElement cartIcon;
	WebElement products;
	
	public InventoryPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getCartIcon() {
		return driver.findElement(By.id("shopping_cart_container"));
	}
	
	public WebElement getAddToCart() {
		return driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button"));
	}
	
	public WebElement getItem1() {
		return driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/a/div"));
	}

	/*public WebElement getProducts() {
		return driver.findElement(By.id("inventory_filter_container"));
	}*/
	
	public WebElement getProducts() {
		return driver.findElement(By.cssSelector("div[class = 'product_label']"));
	}
	
	public void addToCartClick () {
		this.getAddToCart().click();
	}
	
	public void cartIconClick () {
		this.getCartIcon().click();
	}
	public void item1Click () {
		this.getItem1().click();
	}
	
}

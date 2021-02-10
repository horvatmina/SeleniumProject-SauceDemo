package sauceDemoTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests extends BaseTests {
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		driver.navigate().to("https://www.saucedemo.com/index.html");
		Thread.sleep(2000);
	}

	@Test (priority = 0)
	public void logIn () throws InterruptedException {
		indexPage.login("standard_user", "secret_sauce");
		Thread.sleep(2000);	
		
		//Assert.assertEquals(true, inventoryPage.getProducts().isDisplayed());
		
		String text = inventoryPage.getProducts().getText();
		Assert.assertEquals(text, "Products");			
	} 
	
	@Test (priority = 5)
	public void order () throws InterruptedException {
		
		indexPage.login("standard_user", "secret_sauce");
		Thread.sleep(2000);
		inventoryPage.addToCartClick();
		Thread.sleep(2000);
		inventoryPage.cartIconClick();
		Thread.sleep(2000);
		cartPage.checkoutClick();
		Thread.sleep(2000);
		checkoutPage.firstName();
		Thread.sleep(2000);
		checkoutPage.lastName();
		Thread.sleep(2000);
		checkoutPage.zipCode();
		Thread.sleep(2000);
		checkoutPage.continueButtonClick();
		Thread.sleep(2000);
		checkoutPage.finishButtonClick();
		Thread.sleep(2000);
		
		String text = checkoutPage.getThankyou().getText();
		Assert.assertEquals(text, "THANK YOU FOR YOUR ORDER");
		
	}
	
	@AfterMethod
	public void afterMethod () throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}

}

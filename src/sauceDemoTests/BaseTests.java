package sauceDemoTests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import sauceDemoPages.CartPage;
import sauceDemoPages.CheckoutPage;
import sauceDemoPages.IndexPage;
import sauceDemoPages.InventoryPage;

public class BaseTests {
	WebDriver driver;
	IndexPage indexPage;
	InventoryPage inventoryPage;
	CartPage cartPage;
	CheckoutPage checkoutPage;
	
	@BeforeClass
	public void beforeClass () {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.indexPage = new IndexPage (driver);
		this.inventoryPage = new InventoryPage (driver);
		this.cartPage = new CartPage (driver);
		this.checkoutPage = new CheckoutPage (driver);
		
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void afterClass() throws IOException {
		driver.close();
	}
}

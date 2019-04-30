package ca.walmart.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ca.walmart.qa.base.TestBase;
import ca.walmart.qa.pages.HomePage;
import junit.framework.Assert;

/*Testing the Item Order Pipeline
 *  This Test Case covers the following steps:
 * 1. Enter the "BedSheet" in SearchOption.
 * 2. Press Enter.
 * 3. Pick the first item / any item and click "add cart".
 * 4. Click "Continue Shopping".
 * Result: Make sure it shows "Proceed to Checkout" Option.
*/

public class Order extends TestBase {
	HomePage Homepage;

	@BeforeClass
	public void setup() {
		initialization();
		Homepage = new HomePage();
	}

	@Test(priority = 1)
	public void EnterText() {
		Homepage.entertext("Bedsheet");
		Homepage.sbuttonclick();

	}

	@Test(priority = 2)
	public void logo() {
		Homepage.clickaddcart1();

	}

	@Test(priority = 3)
	public void addcart2() {
		Homepage.clickaddcart2();

	}

	@Test(priority = 4)
	public void continueshop() {
		Homepage.continueshop();

	}

	@Test(priority = 5)
	public void AssertCheckout() {
		Assert.assertEquals(Homepage.checkout(), "https://www.walmart.ca/checkout");

	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

}

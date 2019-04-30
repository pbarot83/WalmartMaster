package ca.walmart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ca.walmart.qa.base.TestBase;
import ca.walmart.qa.pages.AddCart;
import ca.walmart.qa.pages.HomePage;

public class Order extends TestBase {
	HomePage Homepage;
	AddCart Addcart;
	
	@BeforeClass
	public void setup() {	
		initialization();
		Homepage = new HomePage();	
	}
	
	@Test(priority=1)
	public void validatelogo() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String logo = Homepage.validatelogo();
		Assert.assertEquals(logo,"Walmart Canada - Save Money. Live Better.");
	}
	
	@Test(priority=2)
	public void EnterText() {
		Homepage.entertext("Bedsheet");
		Homepage.sbuttonclick();
	}
	
	@Test(priority=3)
	public void ClickAddcart() {
		Addcart.clickaddcart1();
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
